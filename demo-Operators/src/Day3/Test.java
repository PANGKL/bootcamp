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
  }

}
