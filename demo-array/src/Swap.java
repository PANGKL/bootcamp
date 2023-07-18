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


    

    String strr = "hello!";
    System.out.println(swapOddEvenCharacter(strr));

    // System.out.println(swapOddEvenCharacter(strr));
  }



  public static String swapOddEvenCharacter(String str) {
    // hello! ->ehll!o
    // abcd -> badc

    char temp = ' ';
    char[] chars = str.toCharArray();

    for (int i = 0; i < chars.length; i++) {
      if (i % 2 != 0) {
        temp = chars[i];
        chars[i] = chars[i - 1];
        chars[i - 1] = temp;
      }
    }

    String output = "";
    for (int i = 0; i < chars.length; i++) {
      output += chars[i];
    }
    return output;


  }
}


