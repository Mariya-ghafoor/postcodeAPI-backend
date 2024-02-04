package com.mariya.PostCodeAPI;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import com.mariya.PostCodeAPI.dto.PostcodeCreateDTO;
import com.mariya.PostCodeAPI.entity.Postcode;
import com.mariya.PostCodeAPI.repository.PostcodeRepository;
import com.mariya.PostCodeAPI.service.PostcodeService;

import net.bytebuddy.asm.Advice.Argument;

@ExtendWith(MockitoExtension.class)
public class PostcodeServiceTest {

  @Mock
  private PostcodeRepository postcodeRepository;
  
  @Mock
  private ModelMapper mapper;

  @InjectMocks
  private PostcodeService underTest;

  @Test
  void getAllPostcodes_ReturnsAllPostcodes(){
    underTest.getAllPostcodes();
    Mockito.verify(postcodeRepository).findAll();

  }

  @Test
  void findByPostcode_ReturnsSuburbWithThatPostcode(){
    underTest.findByPostcode(2122);
    Mockito.verify(postcodeRepository).findByPostcode(2122);

  }

  @Test
  void findByPostcode_ReturnsPostcodeWithThatSuburb(){
    underTest.findBySuburb("waterloo");
    Mockito.verify(postcodeRepository).findBySuburb("waterloo");

  }

  @Test
  void addPostcode_ValidPostcode_AddsPostcodeToDB(){
    PostcodeCreateDTO dto = new PostcodeCreateDTO(1234, "Bondi");
    Postcode postcode = new Postcode(1234,"Bondi");

    BDDMockito.given(mapper.map(dto, Postcode.class)).willReturn(postcode);

    this.underTest.addPostcode(dto);

    ArgumentCaptor<Postcode> postcodeArgument = ArgumentCaptor.forClass(Postcode.class);

    Mockito.verify(postcodeRepository).save(postcodeArgument.capture());

    assertEquals(postcode,postcodeArgument.getValue());



  }


}
