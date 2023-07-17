package Day3;

public class Test {
  public static void main(String[] args) {

    // + - * /
    // > != >= <=
    // boolean xx = true / false
    int speed = 50;
    char drunk = 'n';

    int normalspeed = 50;

    boolean overspeed320 = speed >= normalspeed + 15;
    boolean overspeed450 = speed - normalspeed >= 30;
    boolean overspeed600 = speed - 45 >= normalspeed;
    boolean nopassdrunk = drunk == 'y';

    if (overspeed600 && !(nopassdrunk)) {
      System.out.println("Overspeed charge is $600");
    } else if (overspeed600 && nopassdrunk) {
      System.out.println("Overspeed charge is $600 and under arrest");
    } else if (overspeed450 && !(nopassdrunk)) {
      System.out.println("Overspeed charge is $450");
    } else if (overspeed450 && nopassdrunk) {
      System.out.println("Overspeed charge is $450 and under arrest");
    } else if (overspeed320 && !(nopassdrunk)) {
      System.out.println("Overspeed charge is $320");
    } else if (overspeed320 && nopassdrunk) {
      System.out.println("Overspeed charge is $320 and under arrest");
    } else if (normalspeed <= 50 + 14 && nopassdrunk) {
      System.out.println("You are under arrest");
    } else {
      System.out.println("You are safe");
    }



    /*
     * ******* ooooo*o oooo*oo ooo*ooo oo*oooo o*ooooo *******
     */

    for (int i = 0; i < 7; i++) {
      System.out.print("*");
    }
    System.out.println();

    for (int i = 0; i < 5; i++) {
      for (int j = 5; i < j; j--) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int z = 0; z <= i; z++) {
        System.out.print(" ");
      }
      System.out.println();

    }

    for (int i = 0; i < 7; i++) {
      System.out.print("*");
    }

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();


    for (int i = 0; i < 4; i++) {
      for (int j = 7; i < j / 2; j--) {
        System.out.print("-");
      }
      System.out.print("*");

      for (int z = 0; z <= i * 2 - 1; z++) {
        System.out.print("-");
      }
      System.out.println();
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j <= i * 2 + 1; j++) {
        System.out.print("-");
      }
      System.out.print("*");
      for (int k = 5; i < k / 2; k--) { // k /2 的loop會進行4次
        System.out.print("-");
      }
      System.out.println();
    }

System.out.println(5/2);
System.out.println(4/2);
System.out.println(3/2);
System.out.println(2/2);
System.out.println(1/2);


  }
}
