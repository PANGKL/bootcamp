import java.util.Arrays;

public class RotationSort {

  public static boolean rotateString(String s, String goal) {

    char[] chars = goal.toCharArray();

    char temp = ' ';

    for (int i = 0; i < chars.length; i++) {
      if (chars[0] == 'a') {
        break;
      }
      temp = chars[chars.length - 1];
      for (int j = chars.length - 1; j > 0; j--) {
        chars[j] = chars[j - 1];
      }
      chars[0] = temp;
    }


    if (s.equals(String.valueOf(chars))) {
      return true;
    }
    return false;

  }

  public static void main(String[] args) {

    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
    String str = "cdeab";
    char[] chars = str.toCharArray();
    


    // System.out.println(chars.toString());

  }
}
