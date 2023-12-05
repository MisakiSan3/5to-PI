package com.piback.PIback.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;



import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        AuthCredentials authCredentials = new AuthCredentials();

        try {
            authCredentials = new ObjectMapper().readValue(request.getInputStream(), AuthCredentials.class);
        } catch (IOException e) {
        }

        UsernamePasswordAuthenticationToken usernamePAT = new UsernamePasswordAuthenticationToken(
            authCredentials.getEmail(),
            authCredentials.getPassword(),
            Collections.emptyList()
        );



        return getAuthenticationManager().authenticate(usernamePAT);
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
       
       UserDetailsImp userDetailsImp =(UserDetailsImp)authResult.getPrincipal();
       String token = TokenUtils.createToken(userDetailsImp.getName(), userDetailsImp.getUsername(),userDetailsImp.getId());

       response.addHeader( "Authorization", "Bearer" + token);
       response.getWriter().flush();
       
        super.successfulAuthentication(request, response, chain, authResult);
    }
}
