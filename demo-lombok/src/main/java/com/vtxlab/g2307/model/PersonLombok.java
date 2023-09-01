package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor // annotation
@NoArgsConstructor //
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
public class PersonLombok {

  @Getter 
  private String name;
  
  @ToString.Include
  private int age;

  public static void main(String[] args) {
    PersonLombok personLombok = new PersonLombok("Peter", 23);
    PersonLombok p2 = new PersonLombok();
    p2.setAge(13);
    p2.setName("Eric");

    System.out.println(p2.getAge());
    System.out.println(p2.getName());
    System.out.println(p2.toString());



  }



}
