package Shape;

public class Square10 extends Shape {
  private double length;


  public Square10(double length) {
    this.length = length;
  }


  public double area() {
    return Math.pow(length, 2);
  }

}
