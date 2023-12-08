package com.mariya.PostCodeAPI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "postcodes")
@NamedQuery(name = "Postcode.findByPostcode", query = "select p from Postcode p where p.postcode = ?1")
@NamedQuery(name = "Postcode.findBySuburb", query = "select p from Postcode p where p.suburb = ?1")
public class Postcode {

  @Getter
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Getter
  @Setter
  @Column
  private int postcode;

  @Getter
  @Setter
  @Column
  private String suburb;

  public Postcode() {
  }

  public Postcode(int postcode, String suburb) {
    this.postcode = postcode;
    this.suburb = suburb;
  }

}
