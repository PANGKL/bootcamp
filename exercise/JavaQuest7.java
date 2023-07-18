package exercise;

/**
 * The sum is 55
 */
public class JavaQuest7 {
  // Sum values of an array
  public static void main(String[] args) {
    // Declare a int array, with value 1 to 10
    // code here
    int sum = 0; // 尾減到頭
    int[] arr = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int i = arr.length; i > 0; i--) {
      sum += arr[i - 1];
    }

    // Write a loop to sum up all value in the int array
    // code here
    System.out.println("The sum is " + sum);

    int sum1 = 0;
    int[] arr1 = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int i = -1; i < arr1.length - 1; i++) {
      sum1 += arr[i + 1];
    }
    System.out.println("The sum1 is " + sum1);


  }
}
