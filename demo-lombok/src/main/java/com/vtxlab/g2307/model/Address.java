package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@RequiredArgsConstructor
@Builder
// @SuperBuilder
public class Address {
  private String addrLine1;
  private String addrLine2;
  private String addrLine3;
  @NonNull
  private final Country country;

  // public Address(Country country) {
  // if (country == null) {
  // throw new NullPointerException();
  // }
  // this.country = country;
  // }

  public static void main(String[] args) {
    Address a1 = new Address(Country.HK);



    Address a2 = Address.builder()//
        .addrLine1("Flat 12")//
        .addrLine2("Tuen Mun")//
        .addrLine3("NT")//
        .country(null)// runtime error
        .build();





  }



}
