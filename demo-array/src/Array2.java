import java.util.Arrays;

public class Array2 {
  public static void main(String[] args) {

    System.out.println(swap("12345", 1, 3));

  }

  public static String swap(String str, int index, int index2) {
    // Illegal possibility
    if (str == null || str.isBlank()) { // insurance defence
      return null;
    }
    if (index < 0 || index >= str.length()) { // insurance defence
      return str;
    }
    if (index2 < 0 || index2 >= str.length()) { // insurance defence
      return str;
    }
    // check all illegal possibility then go though main logic



    // Main Logic
    char temp;
    char[] chars = str.toCharArray(); // ms

    temp = chars[index];
    chars[index] = chars[index2];
    chars[index2] = temp;

    return String.valueOf(chars); // ms
    // String abc = new String(chars);
    // return abc;

  }
}
