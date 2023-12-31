package com.hkjava;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import lombok.RequiredArgsConstructor;



@ExtendWith(MockitoExtension.class) //
// @MockitoSettings(strictness = Strictness.LENIENT)

public class SpyTest {

  @Spy
  Calculator calculator;


  @InjectMocks
  Checkout checkout;

@Test
  void testAdd1() {
    when(calculator.substract(3, 4)).thenReturn(100);
    int result = checkout.add(3, 4);
    assertEquals(104, result); // y - y -x-weight -> 4 + 100
    verify(calculator, times(1)).substract(3, 4);
  }

  @Test
  void testAdd2() {
    int result = checkout.add(3, 4);
    assertEquals(3, result);
  }

  @Test
  void test3(){
    when(calculator.multiply(-2, 4)).thenReturn(100);
    //如果唔when,spy object 會照跟原本入的parameter去執行method
    // substract(-2,4) => y - x - this.weight =>   4 - (-2) -2
    int result = checkout.multiply(-2,4);
    assertEquals(104, result); //  100 + (4 - (-2) -2)
  }

}
