import java.util.Arrays;

public class LeeCode942 {
  public static void main(String[] args) {


    String s = "DDI";



    // if (s.charAt(0) == 'I') {
    // arr[0] = min;
    // }
    // if (s.charAt(0) == 'D') {
    // arr[0] = max;
    // }
    int min = 0;
    int max = s.length();
    int[] arr = new int[s.length() + 1];
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'I') {
        arr[i] = min;
        min++;
      }

      if (s.charAt(i) == 'D') {
        arr[i] = max;
        max--;
      }

    }

    arr[arr.length - 1] = min;
    System.out.println(Arrays.toString(arr));
  }

}

