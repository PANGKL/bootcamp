package exercise;

import java.util.Arrays;

/*
 * 
 * Question : Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 * 
 * Constraints : 1 <= n <= 10^5
 * 
 * Example :
 * 
 * Input: n = 4568 Output: 937 Explanation: Product of digits = 4 * 5 * 6 * 8 = 960 Sum of digits = 4 + 5 + 6 + 8 = 23 Result = 960 - 23 = 937
 */

public class JavaQuest22 {
  public static void main(String[] args) {
    System.out.println(findDifferent(1)); // output : 0
    System.out.println(findDifferent(100000));// output : -1
    System.out.println(findDifferent(234)); // output : 15
    System.out.println(findDifferent(4568));// output : 937
    System.out.println(findDifferent(9999));// output : 6525
    System.out.println(findDifferent(11111));// output : -4


    // String nums = String.valueOf(234);
    // char[] chars = nums.toCharArray();


  }

  public static int findDifferent(int n) {

    int add = 0;
    int muu = 1;
    String[] digi = String.valueOf(n).split("");

    int[] arr = new int[digi.length];



    for (int i = 0; i < digi.length; i++) {
      arr[i] = Integer.valueOf(digi[i]);
    }
    // System.out.println(Arrays.toString(arr));

    for (int i = 0; i < arr.length; i++) {
      add = add + arr[i];
    }
    // System.out.println(add);

    for (int i = 0; i < arr.length; i++) {
      muu *= arr[i];
    }
    // System.out.println(muu);



    return muu - add;
  }
}
