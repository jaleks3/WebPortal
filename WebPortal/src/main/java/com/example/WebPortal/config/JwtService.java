package com.example.WebPortal.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

@Service
public class JwtService {
    public String extractUsername(String token) {
        return null;
    }

    private Claims extractAllClaims(String token) {
        return null;
//        return Jwts.parser().setSigningKey(getSigninKey()).build().parseClaimsJws(token);
    }

    private byte[] getSigninKey() {
        return null;
    }
}
