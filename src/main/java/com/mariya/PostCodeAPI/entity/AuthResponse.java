package com.mariya.PostCodeAPI.entity;

import jakarta.servlet.http.Cookie;
import lombok.Getter;
import lombok.Setter;

public class AuthResponse {

  @Getter
  @Setter
  //private String token;
  private String token;

  public AuthResponse() {
  }

  public AuthResponse(String token) {
    this.token = token;
  }

  //Adding cookie to the response
  // public AuthResponse(String token) {
    // Cookie cookie = new Cookie("token",token);
    // cookie.setMaxAge(7 * 24 * 60 * 60); // expires in 7 days
    // cookie.setSecure(true);
    // cookie.setHttpOnly(true);
    // cookie.setPath("/"); // global cookie accessible every where
    // this.cookie = cookie;

  // }

}
