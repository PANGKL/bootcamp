package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Builder;
import lombok.Data;

// @AllArgsConstructor
// @NoArgsConstructor
// @Builder
// @EqualsAndHashCode
// @Getter
// @Setter
// @ToString
@Data //Getter, Setter, ToString, Equals, Hashcode, ReqiredArgConstructor
@AllArgsConstructor
@Builder 
public class Book {
  private String author;
  private double weight;



}
