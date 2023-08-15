package shape;

public class Square extends Shape {

  int length;

  public int getLength() {
    return length;
  }

  public double area() {
    return this.length * 2;
  }


}
