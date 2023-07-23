import java.util.Arrays;

public class insertionSort {
  public static void main(String[] args) {
    // [5, 1, 4, 8, 2]
    // Step1.1: [1,5,4,8,2] (insert 1 to arr[0], 1<5)
    // After round 1, [1,5]is sorted
    // Step2.1: compare 4 < 5 ->move 5 to the right
    // Step2.2: compare 1 < 4
    // After round 2 [1,4,5] is sorted
    int[] nums = new int[] {5, 1, 4, 8, 2};
    int[] nums1 = new int[] {12, 61, 33, 4, 2};

    int[] result = insertionSort(nums);
    System.out.println(Arrays.toString(result));
    int[] result1 = insertionSort2(nums);
    System.out.println(Arrays.toString(result1));
  }

  public static int[] insertionSort(int[] arr) {

    // Bubble sort
    int temp = 0;
    for (int i = 1; i < arr.length; i++) {
      for (int k = i; k > 0; k--) {
        if (arr[i] < arr[k - 1]) {
          temp = arr[k];
          arr[k] = arr[k - 1];
          arr[k - 1] = temp;
          i--;
        }
      }
    }
    return arr;
  }

  public static int[] insertionSort2(int[] arr) {

    int current = 0;

    for (int i = 0; i < arr.length; i++) {
      current = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > current) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = current;
    }
    return arr;

  }
}


// Bubble sort
// int temp = 0;
// for (int i = 1; i < arr.length; i++) {
// for (int k = i; k > 0; k--) {
// if (arr[i] < arr[k - 1]) {
// temp = arr[i];
// arr[i] = arr[i - 1];
// arr[i - 1] = temp;
// i = i - 1;
// }
// }
// }
// return arr;
