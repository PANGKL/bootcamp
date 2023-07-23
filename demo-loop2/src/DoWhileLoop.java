import java.util.Scanner;

public class DoWhileLoop {
  public static void main(String[] args) {
    // do-While, do first, then check condition to start looping;

    int count = 0;
    do { // 無條件先行
      System.out.println("hello");
      count++;
    } while (count < 3);


    int input = 0;
    Scanner scanner;

    do {
      scanner = new Scanner(System.in);
      System.out.println("Please input a integer");
      input = scanner.nextInt();

      // if input is even -> continue;



    } while (input % 2 == 0);

    // if (input % 2 == 1) {
    System.out.println(input);
    // }



  }
}

