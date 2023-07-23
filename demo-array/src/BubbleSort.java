import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    // [5, 1, 4, 8, 2]
    // Step 1.1: [1, 5, 4, 8, 2]
    // Step 1.2: [1, 5, 4, 8, 2]
    // Step 1.3: [1, 4, 5, 8, 2](no swap, due to 5<8)
    // Step 1.4: [1, 4, 5, 2, 8]

    // Step 2.1: [1, 4, 5, 2, 8](no swap, due to 1<4)
    // Step 2.2: [1, 4, 5, 2, 8](no swap, due to 4<5)
    // Step 2.3: [1, 4, 2, 5, 8]
    // target: [1, 2, 4, 5, 8]

    int[] nums = new int[] {5, 1, 4, 8, 2};
    // // System.out.println(sort(nums));
    // int count = 0;
    // int max = 0;
    // int temp = 0;
    // int index = 0;

    // for (int i = 0; i < nums.length; i++) {
    // if (count == 1) {
    // for (int j = 0; j < nums.length; j++) {
    // if (nums[j] > max) {
    // max = nums[j];
    // index = j;
    // }
    // if (j == nums.length - 1) {
    // temp = nums[index];
    // nums[j - 1] = nums[j];
    // nums[j] = temp;
    // count += 1;
    // }
    // }
    // }
    // }

    System.out.println(Arrays.toString(sort(nums)));



  }

  public static int[] sort(int[] arr) {
    int temp = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }

}
