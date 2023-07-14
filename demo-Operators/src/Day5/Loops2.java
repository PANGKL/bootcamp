package Day5;
public class Loops2 {
  public static void main(String[] args) {
    // break
    for (int i = 0; i < 6; i++) { // 0,1,2,3,4,5
      for (int j = 0; j < 6; j++) { // 0,1,2
        System.out.println("i = " + i + ", j = " + j);
        if (i == j) {
          break;// break the inner loop
        }

      }
      // if still have another loop
    }

    // i = 0, j =0, break
    // i =1, j=0, no

    System.out.println();
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == j) {
          continue;
        }
        System.out.println("i = " + i + ", j = " + j);
      }
    }

    // i = 0

    String str = "I love programmingy, I love Java.";

    System.out.println("str length is " + str.length());
    for (int i = 0; i < str.length(); i++) { // i < 32 0-31
      // for loop: Iteration time, base
      System.out.println("hello");
    }

    // str.charAt();
    for (int i = 0; i < str.length(); i++) {
      char letter = str.charAt(i);
      if (letter == 'e') {
        System.out.println(i);
      }
    }

    // Print the index of the first occurrence of the character 'e'
    // str.charAt(int index)

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'e') {
        System.out.println("index = " + i);
        break;
      }
    }

    boolean found = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'y') {
        found = true;
        break; // 可break可不break; break左會快D
      }
    }
    if (found) { // always breakdown
      System.out.println("found");
    } else {
      System.out.println("not found");
    }


    // if the number of occurrence of target >=3 --> think count
    // print yes otherwise print no;
    char target = 'o';
    int num = 0;
    boolean meetTarget = false;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        num += 1;
      } // once finished all num++ possblilty

      if (num >= 3) {       //  turn it break
        meetTarget = true;
        break;
      }
    }

    if (meetTarget) {//print out statement
      System.out.println("yes");
    } else {
      System.out.println("no");
    }



  }
}
