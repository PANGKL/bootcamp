import java.util.Arrays;

public class ForEachLoop2 {
  public static void main(String[] args) {
    // basic
    for (int i = 0; i < 3; i++) {
      System.out.println("bc for loop hello");
    }
    // for-each -> array/array list (data stucture)
    int[] arr = new int[] {1, 2, 3, 4};
    // for(element:data set)

    // 1. for-each do not have stop condition / counter in loop signature
    // 2.

    for (int x : arr) { // if loop though all elements , for each should be frist porioity
      System.out.println("bc for each : " + x);
      System.out.println(arr[0]); // but u still access element by index,

      // modification, but sometimes can enforce prohibit to change array value
      arr[0] = 8;
    }

    // {1,4,10,13,20,0}
    // 1,0
    // 4,20
    // 10,13
    for (int i = 0; i < arr.length; i++) { // counter manualy
      if (i > arr.length / 2 - 1) {
        break;
      }
      System.out.println("hello2");
      System.out.println(arr[i] + arr[arr.length - i - 1]);
    }

    String[] strs = new String[] {"hello", "world"};
    for (String x : strs) { // x can be named
      System.out.println(x);
    }

    Character[] chars = new Character[] {'L', 's', 'G', 's'};
    for (Character x : chars) {
      System.out.println(x);
    }



    String s2 = "Hello world ! I am PKL";
    // String[] str = s2.split(" ");s
    // System.out.println(Arrays.toString(str));

    char[] split1 = s2.toCharArray();

    System.out.println(Arrays.toString(split1));
    int count1 = 0;
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == ' ') {
        count1++;
      }
    }

    String[] str = new String[count1 + 1];
    // "H,e,l,l,o, ,w,o,r,l,d, ,!, ,I, ,a,m, ,P,K,L";
    // System.out.println(str[1] += split1[0]);


    int index = 0;
    String letter = "";

    for (int k = 0; k < split1.length; k++) {


      if (split1[k] != ' ') {
        letter += String.valueOf(split1[k]);
        // System.out.println(letter);
      } else if (split1[k] == ' ') {
        str[index] = letter;
        letter = "";
        index++;
        if (k == str.length) {
          str[index] = letter;
        }
      }
    }
    System.out.println(Arrays.toString(str));



    ///////////////////////////////////////////////////////////
    String s3 = "Hello world ! I am PKL";

  }



  public static String[] split(String s2) {
    // Apporach 1
    int count = 0;
    String str = s2.trim();

    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == ' ') {
        count++;
      }
    }

    String[] result = new String[count + 1]; // new array 有幾多個character

    int startIndex = 0; // pin
    int idx = 0; // pin
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == ' ') {
        result[idx] = s2.substring(startIndex, i);
        idx++;
        startIndex = i + 1;
      } else if (i == s2.length() - 1) {
        result[idx] = s2.substring(startIndex, s2.length());
      }
    }

    return result;

    // Apporach
  }



}
// for(int i = 0; i<s2.length();i++){
// if (int.)
// if (s2.charAt(i+1) == ' '){
// }
// }
// substring
// toCharArray
// for (String x : str) {

// System.out.println(x);


