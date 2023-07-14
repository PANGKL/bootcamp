package Day3;
import java.util.Scanner; // import /automate/ 本身不存在java file入面

public class Readinput {
  public static void main(String[] args) {
    // Scanner -> read user input

    Scanner s = new Scanner(System.in); // read user input, expecting it is an integer
    System.out.println("Please input a integer: ");
    int input = s.nextInt(); // read user input, expecting it is integer
    System.out.println("input : " + input);

    
    
    for (int i = 0; i < input; i++) {
      System.out.println("i="+ i +"Hello");
    }
  }

}
