package com.grupo11.digitalbooking.digitalbookingrentalcars.service.interfaces;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;

public interface JwtService {

    String extractUserName(String token);
    Date extractExpiration(String token);
    Date extractClaimDate(String token);
    String extractClaimUsername(String token);
    String generateToken(UserDetails userDetails);
    Boolean validateToken(String token, UserDetails userDetails);
}
