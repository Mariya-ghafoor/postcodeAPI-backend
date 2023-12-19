package com.mariya.PostCodeAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariya.PostCodeAPI.dto.RegisterDTO;
import com.mariya.PostCodeAPI.entity.User;
import com.mariya.PostCodeAPI.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public User create(RegisterDTO data) {
    User newUser = new User(data.getEmail(), data.getUsername(), data.getPassword());
    return this.userRepository.save(newUser);
  }

  public User getById(Long id) {
    User found = this.userRepository.findById(id).orElse(null);
    return found;
  }

  public User getByUsername(String username) {
    return this.userRepository.findByUsername(username).orElse(null);
  }

}
