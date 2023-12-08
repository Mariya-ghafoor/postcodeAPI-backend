package com.mariya.PostCodeAPI.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariya.PostCodeAPI.dto.PostcodeCreateDTO;
import com.mariya.PostCodeAPI.entity.Postcode;
import com.mariya.PostCodeAPI.repository.PostcodeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PostcodeService {

  @Autowired
  PostcodeRepository postcodeRepository;

  @Autowired
  private ModelMapper modelMapper;

  public List<Postcode> getAllPostcodes() {
    return this.postcodeRepository.findAll();
  }

  public Postcode addPostcode(PostcodeCreateDTO postcode) {
    System.out.println("^^^^^ in service");
    Postcode newPostcode = modelMapper.map(postcode, Postcode.class);
    return this.postcodeRepository.save(newPostcode);
  }

  public Postcode findByPostcode(int postcode) {
    Postcode foundPostcode = postcodeRepository.findByPostcode(postcode);
    System.out.println("^^^^^^ found postcode " + foundPostcode);
    return foundPostcode;
  }

  public Postcode findBySuburb(String suburb) {
    Postcode foundPostcode = postcodeRepository.findBySuburb(suburb);
    return foundPostcode;
  }

}
