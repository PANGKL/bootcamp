import java.util.Arrays;

public class Maximum69 {

  public static void main(String[] args) {
    int num = 9996;
    String num1 = String.valueOf(num);
    char[] arr = num1.toCharArray();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == '6') {
        arr[i] = '9';
        break;
      }
    }
    System.out.println(String.valueOf(arr));
  }



}

