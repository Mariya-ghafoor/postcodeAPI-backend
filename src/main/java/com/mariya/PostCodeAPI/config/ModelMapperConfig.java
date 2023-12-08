package com.mariya.PostCodeAPI.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mariya.PostCodeAPI.converters.StringTrimConverter;
// import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

  @Bean
  public ModelMapper modelMapper() {
    ModelMapper mapper = new ModelMapper();
    mapper.typeMap(String.class, String.class).setConverter(new StringTrimConverter());

    // don't update null values
    mapper.getConfiguration().setSkipNullEnabled(true);

    return mapper;

  }

}