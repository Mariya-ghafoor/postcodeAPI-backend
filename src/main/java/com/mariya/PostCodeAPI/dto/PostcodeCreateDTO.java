package com.mariya.PostCodeAPI.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

public class PostcodeCreateDTO {

  @Getter
  @Setter
  @NotNull(message = "Postcode cannot be empty")
  @Min(1000)
  @Max(9999)
  private Integer postcode;

  @Getter
  @Setter
  @NotBlank(message = "Suburb cannot be empty")
  private String suburb;

  public PostcodeCreateDTO(int postcode, String suburb) {
    this.postcode = postcode;
    this.suburb = suburb;
  }

}
