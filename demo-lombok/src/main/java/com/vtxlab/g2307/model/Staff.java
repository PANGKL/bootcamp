package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
// @AllArgsConstructor // not include parent class
public class Staff extends Human {
  private double salary;


  // you have to manuall code the constructor with Parent 's attribute
  public Staff(String name, double salary) {
    super(name);
    this.salary = salary;
  }

  public static void main(String[] args) {
    Staff staff = new Staff("Peter", 3000.00);
    Staff staff2 = new Staff("John", 3000.00);
    System.out.println(staff.equals(staff2)); // true
    // @EqualsAndHashCode only recognize the child attribute



  }



}
