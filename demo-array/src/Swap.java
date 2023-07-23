import javax.print.DocFlavor.STRING;

public class Swap {
  public static void main(String[] args) {
    int[] arr = new int[] {100, -400, 3, 99};
    // code here .. to swap 100 and 99


    // int a = arr[arr.length - arr.length];
    // int b = arr[arr.length - 1];
    // arr[0] = b;
    // arr[arr.length - 1] = a;

    int temp = arr[0]; // back up
    arr[0] = arr[arr.length - 1];
    arr[arr.length - 1] = temp;

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }



    String strr = "abcde";
    System.out.println(swapOddEvenCharacter(strr));

    // System.out.println(swapOddEvenCharacter(strr));
  }

  public static double swapOddEvenCharacter(double str) {
    return 1;

  }



  public static String swapOddEvenCharacter(String str) {
    // 1.think test case first
    // hello! ->ehll!o
    // abcd -> badc
    // ""
    // "cc hc"
    // "abc cd"

    char temp = ' ';
    char[] chars = str.toCharArray(); // if write , it must be toCharArray
    // (越Primitive原始,越快)
    for (int i = 0; i < chars.length; i++) {
      if (i % 2 != 0) {
        temp = chars[i];
        chars[i] = chars[i - 1];
        chars[i - 1] = temp;
      }
    }

    // String output = "";
    // for (int i = 0; i < chars.length; i++) {
    // output += chars[i];
    // }
    // return output;
    return String.valueOf(chars); // 將array/int/轉成String 的method

    // String str = String.valueOf(chars);
    // String str2 = String.of(chars);
    // String abc = new String(chars);


  }
}


// return String.of(chars)


