import java.util.Arrays;

public class SearchArray {
  public static void main(String[] args) {
    char target = 'm';
    char[] chars = new char[] {'j', 'g', 'm', 'm', 'w', 'h'};
    String str = "";

    for (int i = 0; i < chars.length; i++) {
      str += chars[i];
    }

    for (int i = 0; i < chars.length; i++) {
      if (str.charAt(i) == target) {
        System.out
            .println("The index of " + target + " in chars is [" + i + "].");
        break;
      }
    }

    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == 'm') {
        System.out.println("index = " + i);
      }
    }

    // toCharArray()
    String str2 = "I am a boy"; // 11 characters
    char[] arr = str2.toCharArray(); // method to chage str to char and becomes array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
    System.out.println();
    System.out.println(Arrays.toString(arr));
    // [I, , a, m, , a, , b, o, y]


    System.out.print("[");
    for (int i = 0; i < str2.length(); i++) {
      System.out.print(str2.charAt(i) + ", ");
    }
    System.out.print("]");

    System.out.println();




/* ----------------------------------------------------------------------------------------------- */


    // Find max. value in the array
    int[] nums = new int[] {22, 32, 53, 11, 90, 12, 23, 40};
    int max = 0; // set the temp varible for comparation
    // have bug ,cause the value can be 負數, most ideal is use min value of type of int
  
    for (int i = 0; i < nums.length; i++) { // nums.length = 5
      if (nums[i] > max) { // replace
        max = nums[i];
      }
    }
    System.out.println("Max value in array = " + max);


    

    int min = 0;
    int tempmax = max; //contain a temp for comparing of array value, and avoid to replace raw max value

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < tempmax) {
        tempmax = nums[i];
        min = nums[i];
      }
    }
    System.out.println("Min value in array = " + min);

  }

}
