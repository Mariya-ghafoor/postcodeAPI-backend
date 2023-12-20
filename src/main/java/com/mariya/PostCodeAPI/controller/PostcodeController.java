package com.mariya.PostCodeAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mariya.PostCodeAPI.dto.PostcodeCreateDTO;
import com.mariya.PostCodeAPI.entity.Postcode;
import com.mariya.PostCodeAPI.exceptions.NotFoundException;
import com.mariya.PostCodeAPI.service.PostcodeService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/postcodes")
public class PostcodeController {

  @Autowired
  PostcodeService postcodeService;

  @GetMapping()

  public ResponseEntity<List<Postcode>> getPostcodes() {
    List<Postcode> postcodes = this.postcodeService.getAllPostcodes();
    return new ResponseEntity<>(postcodes, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Postcode> addPostcode(@Valid @RequestBody PostcodeCreateDTO postcode) {
    Postcode newPostcode = this.postcodeService.addPostcode(postcode);

    return new ResponseEntity<>(newPostcode, HttpStatus.CREATED);

  }

  @GetMapping("/query")
  @ResponseBody
  public ResponseEntity<Postcode> findByPostcode(@RequestParam(required = false) Integer postcode,
      @RequestParam(required = false) String suburb) {

    // Assuming request params will never be empty
    Postcode foundPostcode = postcode == null ? this.postcodeService.findBySuburb(suburb)
        : this.postcodeService.findByPostcode(postcode);

    if (foundPostcode == null) {
      throw new NotFoundException(String.format("Postcode does not exist"));
    }
    return new ResponseEntity<>(foundPostcode, HttpStatus.FOUND);

  }

  // @GetMapping("/query")
  // @ResponseBody
  // public ResponseEntity<Postcode> findBySuburb(@RequestParam Integer postcode)
  // {
  // Postcode foundPostcode = this.postcodeService.findByPostcode(postcode);
  // return new ResponseEntity<>(foundPostcode, HttpStatus.FOUND);

  // }

}
