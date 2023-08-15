package shape;

public class Circle extends Shape {
  int radius;


  public int getRadius() {
    return radius;
  }

  public double area() {
    return Math.pow(this.radius, 2) * Math.PI;
  }

  public Circle() {

  }

  public static void main(String[] args) {
    Circle c1 = new Circle();

  }


}
