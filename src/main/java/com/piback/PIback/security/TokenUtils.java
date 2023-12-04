package com.piback.PIback.security;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.security.Keys;

public class TokenUtils {
    private final static String ACCESS_TOKEN_SECRET = "abcddeea";
    private final static Long  ACCESS_TOKEN_VALIDITY_SECONDS = 86_400L;
    
    public static String createToken(String nombre,String email,Long id){
        long expirationTime = ACCESS_TOKEN_VALIDITY_SECONDS * 1_000;
        Date expirationDate = new Date(expirationTime + System.currentTimeMillis());

        Map<String, Object> info= new HashMap();
        info.put("id", id);

        return Jwts.builder()
        .setSubject(email)
        .setExpiration(expirationDate)
        .addClaims(info)
        .signWith(Keys.hmacShaKeyFor(ACCESS_TOKEN_SECRET.getBytes()))
        .compact();
    }

    public static UsernamePasswordAuthenticationToken getAuthentication(String token){
        try {
            Claims claims =  Jwts.parserBuilder()
                        .setSigningKey(ACCESS_TOKEN_SECRET.getBytes())
                        .build()
                        .parseClaimsJws(token)
                        .getBody();

        String email = claims.getSubject();

        return new UsernamePasswordAuthenticationToken(email,null, Collections.emptyList());
            
        } catch (Exception e) {
           return null;
        }
    }
}
