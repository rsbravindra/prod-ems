package com.prod.ems.security;

import com.prod.ems.enums.Role;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {
    private final String key = String.valueOf(Keys.hmacShaKeyFor("YourSuperSecretKeyYourSuperSecretKey".getBytes()));

//    public String generateToken(String username, Role role) {
//        return Jwts.builder()
//                .subject(username)
//                .issuedAt(new Date())
//                .expiration(new Date(System.currentTimeMillis() + 3600000))
//                .signWith(key)
//                .compact();
//
//    }
}
