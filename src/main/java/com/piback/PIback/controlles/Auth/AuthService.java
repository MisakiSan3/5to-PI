package com.piback.PIback.controlles.Auth;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.piback.PIback.models.User;
import com.piback.PIback.JWT.JWTService;
import com.piback.PIback.models.Role;
import com.piback.PIback.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final JWTService jwtService;
    //private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthResponse login(LoginRequest request)
    
    {
       return (null);
        /*authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.findByUsername(), request.getPassword()));
    UserDetails user = userRepository.findByUsername(request.getUsername()).orElseThrow();
    String token = jwtService.getToken(user);
    return AuthResponse.builder().token(token)
    .build();*/
    }
   
    //Registro de Usuario
    public AuthResponse register(RegisterRequest request)
    {
        System.out.println(request);

       User user = User.builder()
       .username(request.getUsername())
       .email(request.getEmail())
       .password(request.getPassword())
       .role(Role.USER)
       .build();

       userRepository.save(user);

       return AuthResponse.builder()
       .token(jwtService.getToken(user))
       .build();
    }
}
