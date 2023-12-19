package com.mariya.PostCodeAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mariya.PostCodeAPI.dto.LoginDTO;
import com.mariya.PostCodeAPI.dto.RegisterDTO;
import com.mariya.PostCodeAPI.entity.AuthResponse;
import com.mariya.PostCodeAPI.entity.User;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AuthService {

  @Autowired
  private PasswordEncoder passwordEncoder;

  @Autowired
  private UserService userService;

  @Autowired
  private AuthenticationManager authenticationManager;

  @Autowired
  private JwtService jwtService;

  public AuthResponse register(RegisterDTO data) {
    String encodedPassword = passwordEncoder.encode(data.getPassword());
    data.setPassword(encodedPassword);

    User newUser = this.userService.create(data);

    String token = this.jwtService.generateToken(newUser);

    return new AuthResponse(token);

  }

  public User findByUsername(String username) {
    return this.userService.getByUsername(username);
  }

  public AuthResponse login(LoginDTO data) {
    System.out.println("LOGIN DATA RECEIEVED " + data.getUsername());

    UsernamePasswordAuthenticationToken userPassToken = new UsernamePasswordAuthenticationToken(data.getUsername(),
        data.getPassword());

    authenticationManager.authenticate(userPassToken);

    User user = this.userService.getByUsername(data.getUsername());

    if (user == null) {
      return null;
    }

    String token = this.jwtService.generateToken(user);
    return new AuthResponse(token);
    // return user;
  }

}
