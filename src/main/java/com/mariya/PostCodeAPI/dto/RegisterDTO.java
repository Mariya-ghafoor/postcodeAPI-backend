package com.mariya.PostCodeAPI.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

public class RegisterDTO {

  @Getter
  @Setter
  @NotBlank(message = "Username is required")
  private String username;

  @Email(message = "Valid email is required")
  @NotBlank(message = "Email is required")
  @Getter
  @Setter
  private String email;

  @NotBlank(message = "Password is required")
  @Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", message = "Password must be of minimum 8 characters with atleast one uppercase, one lowercase, one digit and once special character")
  @Getter
  @Setter
  private String password;

}
