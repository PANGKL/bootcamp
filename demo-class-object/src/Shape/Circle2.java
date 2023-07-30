package Shape;

import java.math.BigDecimal;
import java.util.function.BiConsumer;

public class Circle2 {

  private double radius;
  private static final double pi = 3.14159;

  public Circle2(double radius) {
    this.radius = radius;
  }

  public static Circle2 of(double radius) {
    return new Circle2(radius);
  }



  public BigDecimal area() {
    return BigDecimal.valueOf(this.radius)
        .multiply(BigDecimal.valueOf(this.radius))
        .multiply(BigDecimal.valueOf(pi));
  }


  public static void main(String[] args) {
    System.out.println(0.1 * 0.1); // 0.010000000000000002
    Circle2 c1 = new Circle2(22);
    System.out.println(c1.area());

    System.out.println(new Circle2(23).area());
    System.out.println(of(5.5d).area()); // 95.0330975
    System.out.println(BigDecimal.valueOf(5.5));
  }


}
