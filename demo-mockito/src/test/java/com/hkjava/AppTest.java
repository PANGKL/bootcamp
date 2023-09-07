package com.hkjava;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;


/**
 * Unit test for simple App.
 */


@ExtendWith(MockitoExtension.class) // Junit extend Mock
@MockitoSettings(strictness = Strictness.LENIENT)
public class AppTest {

  @Mock // mock obj
  Calculator calculator; // null

  @InjectMocks
  Checkout checkout; // auto new checkout obj


  @Test
  void testSubstract() {
    Calculator obj = new Calculator(0); // real create new object
    assertEquals(-4, obj.substract(10, 6));
    assertEquals(6, obj.multiply(2, 3));
  }



  @Test
  void Testadd(){
    when(calculator.substract(3, 4)).thenReturn(100);
    Checkout checkout = new Checkout(calculator);
    int result = checkout.add(3,4);
    assertEquals(104, result);  // y + substract->(100) 4 + 100
    verify(calculator, times(1)).substract(3, 4);
  }

  @Test
  void testAdd2(){
    when(calculator.substract(1, 4)).thenReturn(1000);
    Checkout checkout = new Checkout(calculator);
    int result = checkout.add(1, 4); 
    assertEquals(5, result);  // x = 1 < 1 then x + y
    verify(calculator, never()).substract(1, 4);

  }

  @Test
  void testMultiply(){
    when(calculator.substract(7, 9)).thenReturn(10000);
    when(calculator.multiply(7, 9)).thenReturn(10000);

    int result = checkout.multiply(7, 9); // x > 1 then y + multiply(7,9) -> y + 10000
    assertEquals(10009,result);
  }

  @Test
  void testMultiply2(){
    when(calculator.substract(1, 9)).thenReturn(10000);
    // when(calculator.multiply(7, 9)).thenReturn(10000); 
    // -> if no when method by default value return 0 /null/false

    int result = checkout.multiply(1, 9);  //
    assertEquals(10000,result);


  }



}
