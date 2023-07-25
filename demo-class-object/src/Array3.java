import java.util.Arrays;

public class Array3 {



  public static void addOne(int[] arr) { // arr -> obj reference => Pass by reference/address 改埋出面array
    for (int i = 0; i < arr.length; i++) {
      arr[i] += 1;
    }
  }


  public static int[] addOne1(int[] arr) { // 不需要return anything, 本身已知obj reference
    int[] res = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      res[i] += 1;
    }
    return res;
  }


  // All Wrapper class + String -> Pass by Value
  public static String concat(String s1, String s2) { // insert copy value to excute method
    s1 = "Hello";
    return s1 + s2;
  }

  public static void main(String[] args) {
    int[] nums = new int[] {3, 4, 8};
    addOne(nums); // 4,5,9
    System.out.println(Arrays.toString(nums));


    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }


    // Call concat
    String a = "abc";
    String b = "def";
    System.out.println(concat(a, b)); // abcdef
    System.out.println(a);
    System.out.println(b);



  }

}
