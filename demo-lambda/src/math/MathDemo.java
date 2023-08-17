package math;

public class MathDemo {

  public static int calculate(int i, int j, MathOperation formula) {
    return formula.operate(i, j);
  }

  public static int gogogo(int i, int j, Mathgogogo go) {
    return go.mathgogogo(i, j);
  }

  public static void main(String[] args) {
    MathOperation add = (a, b) -> a + b;
    MathOperation substract = (x, y) -> x - y;
    MathOperation multply = (x, y) -> x * y;
    MathOperation divide = (x, y) -> x / y;

    Mathgogogo n2 = (x, y) -> (int) Math.pow(x, y);



    System.out.println(calculate(1, 2, add));
    System.out.println(calculate(5, 5, (x, y) -> x * y));
    System.out.println(gogogo(2, 3, n2));



  }

}
