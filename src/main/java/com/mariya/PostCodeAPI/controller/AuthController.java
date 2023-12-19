package com.mariya.PostCodeAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.mariya.PostCodeAPI.dto.LoginDTO;
import com.mariya.PostCodeAPI.dto.RegisterDTO;
import com.mariya.PostCodeAPI.entity.AuthResponse;
import com.mariya.PostCodeAPI.entity.User;
import com.mariya.PostCodeAPI.service.AuthService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/auth")
public class AuthController {

  @Autowired
  private AuthService authService;

  @PostMapping("register")
  public ResponseEntity<AuthResponse> register(@Valid @RequestBody RegisterDTO data) {
    User findUser = this.authService.findByUsername(data.getUsername());
    if (findUser == null) {
      return new ResponseEntity<>(this.authService.register(data), HttpStatus.CREATED);
    }

    throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Username already exists!");
  }

  @PostMapping("/login")
  public ResponseEntity<AuthResponse> login(@Valid @RequestBody LoginDTO data) {
    return new ResponseEntity<>(this.authService.login(data), HttpStatus.OK);
  }

}
