package com.mariya.PostCodeAPI.filter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.mariya.PostCodeAPI.entity.User;
import com.mariya.PostCodeAPI.service.JwtService;
import com.mariya.PostCodeAPI.service.UserService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthFilter extends OncePerRequestFilter {
  @Autowired
  private JwtService jwtService;

  @Autowired
  private UserService userService;

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
      throws ServletException, IOException {
    String authHeader = request.getHeader("Authorization");
    System.out.println(authHeader + " AUTH HEADER ");

    if (authHeader == null || !authHeader.startsWith("Bearer")) {
      filterChain.doFilter(request, response);
      return;
    }
    String jwtToken = authHeader.substring(7);
    Long userId = this.jwtService.extractUserId(jwtToken);

    if (userId != null && SecurityContextHolder.getContext().getAuthentication() == null) {
      User user = this.userService.getById(userId);

      System.out.println(this.jwtService.isTokenValid(jwtToken, user) + " IS TOKEN VALID?");

      // find user in db

      // create a verify token method
      // double check that the token is valid/not expired
      if (this.jwtService.isTokenValid(jwtToken, user)) {

        // save the user in SecurityContextHolder so Spring knows we can show the
        UsernamePasswordAuthenticationToken userPassToken = new UsernamePasswordAuthenticationToken(user, null,
            user.getAuthorities());

        userPassToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

        SecurityContextHolder.getContext().setAuthentication(userPassToken);
      }

    }

    filterChain.doFilter(request, response);

  }

}