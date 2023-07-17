import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    int num = 7;
    int num2 = 8;
    int num3 = -30;


    // Create Array (Approach 1)
    // define length of nums
    // type
    int[] nums = new int[3]; // 3 is the length of array nums
    // with index 0,1,2 (you can treat it as address)
    nums[0] = -40;
    nums[1] = 500;
    nums[2] = -1000;
    nums[0] = 5000;
    // nums[3] = 123; //Index 3 out of bounds for length 3

    // double array
    double[] dou = new double[10];
    dou[0] = 220.23;
    dou[1] = 23.412;
    dou[2] = 12349.213;
    dou[3] = 1231.123;
    dou[9] = 1564.123;



    // char[], int[], String[] 常用
    for (int i = nums.length - 1; i >= 0; i--) { // 0,1,2
      System.out.println("nums [" + i + "] is " + nums[i]);
    }

    System.err.println(nums.length);


    for (int i = 0; i < dou.length; i++) {
      if (dou[i] != 0) {
        System.out.println("dou " + (i + 1) + " is " + dou[i]);
      }
    }



    int[] array = new int[] {3, 9, 12}; // no need index,

    for (int i = 0; i < array.length; i++) {
      System.out.println("array [" + i + "] is " + nums[i]);
    }

    // can add a new element in tail? No
    // Modify an element
    array[2] = -10;
    // Access an element
    int index = 2;
    System.out.println(array[index]); // -10


    char[] chars = new char[3];
    chars[0] = 'a';
    // chars[1] = '@';
    chars[2] = '#';

    for (int i = 0; i < chars.length; i++) {
      System.out.println("char [" + i + "] = " + chars[i]);
    }

    long[] numbers = new long[4];
    numbers[0] = 123;
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("numbers [" + i + "] = " + numbers[i]);
    }

    boolean[] arr2 = new boolean[2];
    arr2[0] = true;
    for (int i = 0; i < arr2.length; i++) {
      System.out.println("arr2 [" + i + "] = " + arr2[i]);
    }


    String[] str = new String[3];
    str[0] = "1";
    str[1] = "2";
    str[2] = "3";
    // str[2] = 2; // diff type

    for (int i = str.length - 1; i >= 0; i--) {
      System.out.println("str [" + i + "] is " + str[i]);
    }


    String[] fruit = new String[5];
    fruit[0] = "apple";
    fruit[1] = "orange";
    fruit[2] = "pear";

    System.out.println(Arrays.toString(fruit));

    



  }
}
