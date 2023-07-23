import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    // 1-100
    // bomb = 45 (random number)
    // user input : 30 -> 31-100
    // user input: 30
    Scanner scanner;
    int input = 0;

    int bomb = new Random().nextInt(100) + 1;// 1-100
    // int bomb = 10;
    int min = 1;
    int max = 100;

    do {
      scanner = new Scanner(System.in);
      System.out.print("Please input a number : ( " + min + " - " + max + " )");
      input = scanner.nextInt();

      if (input < bomb && input > min) {
        min = input + 1;
        System.out.println("range = " + min + " - " + max);
        // } else if (input < min) {
        // System.out.println("Please input number within " + min + " - " + max);
        // continue;
      } else if (input > bomb && input < max) {
        max = input - 1;
        System.out.println("range = " + min + " - " + max);
      } else if (input > max || input < min) {
        continue;
      }

    } while (input != bomb);

    System.out.println("Bombbbbbb!!!!!!");

    // min and max should be modified in each iteration
    // while


  }
}
