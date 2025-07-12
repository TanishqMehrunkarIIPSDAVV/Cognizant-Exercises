package com.example.jwt;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired private AuthenticationManager authManager;
    @Autowired private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<Map<String,String>> login(@RequestBody AuthRequest request) {
        Authentication authentication = authManager.authenticate(
            new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
        );
        String token = jwtUtil.generateToken(request.getUsername());
        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, JWT Authenticated User!";
    }
}

class AuthRequest {
    private String username;
    private String password;
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
