import java.util.Arrays;

public class Swap2 {
  public static void main(String[] args) {
    int[] num = new int[] {8, 3, -10, -30, 100, -19};

    // Move the max number to the tail
    // {8,3,-10,30,19,100}
    //
    int max = 0;
    int maxindex = 0;
    for (int i = 0; i < num.length; i++) {
      if (num[i] > max) {
        max = num[i];
        maxindex = i;
      } else if (i == num.length - 1) {
        num[maxindex] = num[i];
        num[i] = max;
      }
    }


    System.out.println("new int = " + Arrays.toString(num));

    System.out.println(average(num));


    int[] testcase = new int[] {2, 3, 0};
    System.out.println(average(testcase)); // 1.66667


  }



  public static double average(int[] arr) {
    // calculate the average of all numbers in arr.
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    // return sum / arr.length;
    return (double) sum / arr.length; // change sum to double before division



  }

}

