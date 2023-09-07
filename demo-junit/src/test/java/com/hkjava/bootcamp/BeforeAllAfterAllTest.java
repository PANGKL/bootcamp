package com.hkjava.bootcamp;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAllAfterAllTest {
  private int x;

  @BeforeAll
  static void before() {
    System.out.println("beforeAll test");
  }

  @AfterAll
  static void afterAll() {
    System.out.println("afterAll start");
  }


  @Test
  void test() {
    x++;
    assertTrue(x == 1);
    System.out.println("test x = " + x);
  }

  @Test
  void test2() {
    x++;
    assertTrue(x == 2);
    System.out.println("test2 x = " + x);

  }

}
