package com.mariya.PostCodeAPI;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.mariya.PostCodeAPI.entity.Postcode;
import com.mariya.PostCodeAPI.repository.PostcodeRepository;

@DataJpaTest
public class PostcodeRepositoryTest {

  @Autowired
  private PostcodeRepository underTest;

  @Test
  void selectExistsPostcode_PostcodeExists_ReturnTrue(){
    int postcode = 2122;
    Postcode newPostcode = new Postcode(postcode,"Marsfield");
    this.underTest.save(newPostcode);
    Boolean exists = this.underTest.selectExistsPostcode(postcode);
    assertTrue(exists);
  }

  @Test
  void selectExistsPostcode_PostcodeDoesntExist_ReturnFalse(){
    System.out.println("**********Running test");
    Boolean exists = this.underTest.selectExistsPostcode(2123);
    System.out.println("**********Result");
    assertFalse(exists);
   
  }

  @Test
  void testMessage(){
    System.out.println("Hi");
}

  
}
