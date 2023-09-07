package com.hkjava.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class BeforeAfterTest {

  private int x;


  @BeforeEach // programme
  void beforeEach() {
    System.out.println("before each start!");
    assertEquals(0, this.x);
    x += 3;
  }

  @AfterEach
  void afterEach() {
    System.out.println("endOfTest start");
    this.x -= 2;
    System.out.println("End x = " + this.x);
  }

  

  @Test
  void testAdd() {
    System.out.println("testAdd start!");
    assertEquals(8, App.add(this.x, 5));
  }

  @Test
  void testAdd2() {
    System.out.println("testAdd2 start!");
    assertEquals(8, App.add(this.x, 5));
  }

}
