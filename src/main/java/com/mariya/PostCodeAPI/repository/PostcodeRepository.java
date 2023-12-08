package com.mariya.PostCodeAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariya.PostCodeAPI.entity.Postcode;

public interface PostcodeRepository extends JpaRepository<Postcode, Long> {
  Postcode findByPostcode(int postcode);

  Postcode findBySuburb(String suburb);

}
