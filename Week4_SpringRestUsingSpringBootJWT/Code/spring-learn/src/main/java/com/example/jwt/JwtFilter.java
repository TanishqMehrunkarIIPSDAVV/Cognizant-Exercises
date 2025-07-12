package com.example.jwt;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.util.ArrayList;

@Component
public class JwtFilter extends GenericFilter {

    @Autowired private JwtUtil jwtUtil;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String authHeader = httpRequest.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            String jwt = authHeader.substring(7);
            if (jwtUtil.validateToken(jwt)) {
                String username = jwtUtil.extractUsername(jwt);
                UsernamePasswordAuthenticationToken token =
                        new UsernamePasswordAuthenticationToken(username, null, new ArrayList<>());
                token.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpRequest));
                SecurityContextHolder.getContext().setAuthentication(token);
            }
        }

        chain.doFilter(request, response);
    }
}
