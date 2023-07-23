import java.util.Arrays;

public class Method2 {
  public static void main(String[] args) {
    int[] nums = new int[] {1, 2, 10, 3, 4, 20};
    int[] nums2 = products(nums);
    System.out.println(Arrays.toString(nums2));

  }


  public static int[] products(int[] arr) {
    // int[] product = new int[arr.length - 1];
    for (int i = 0; i < arr.length -1; i++) {
      arr[i] = product(arr[i], arr[i + 1]); // 可create new array or modfiy original array
    }
    return arr;

  }


  public static int product(int a, int b) {
    return a * b;
  }

}
