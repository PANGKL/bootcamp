package com.hkjava.bootcamp;

public class minimum35 {
  
  public static int minimum35Number(int num) {
    String result = String.valueOf(num);
    char[] arr = result.toCharArray();
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (count == 2) {
        break;
      }
      if (arr[i] == '5') {
        count++;
        arr[i] = '3';
      }
    }
    return Integer.valueOf(String.valueOf(arr));
  }
  
}
