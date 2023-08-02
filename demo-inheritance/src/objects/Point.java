package objects;

import java.util.Objects;

public class Point {

  int x;
  int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }



  @Override
  public int hashCode() {
    // Is not unique repersentation of object reference
    return Objects.hash(this.x, this.y); // put all attribute
  }

  ///////////////// Important ////////////////////////////////////////////

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Point))
      return false;
    Point point = (Point) o;
    return point.x == this.x && point.y == this.y;
    // return Objects.equals(point.x, this.x) && Objects.equals(point.y, this.y);
  }

  ///////////////// Important ////////////////////////////////////////////


  @Override
  public String toString() {
    return "[ x = " + this.x + ", y = " + this.y + "]";
  }



  public static void main(String[] args) {

    Point p1 = new Point(1, 1);
    Point p2 = new Point(1, 1);
    Point p3 = new Point(1, 2);

    System.out.println(p1 == p2);
    System.out.println(p1.equals(p2));
    System.out.println(p2.equals(p3));

    System.out.println(p1.toString());
    System.out.println(Points.toString(p3));


    Long l = 1L; // Unbox -> pri long
    int i = 1; // auto-box -> Integer
    Object x = (Object) i;

    Point.print(10L);
    // Point.print(10);// Cannot convert int to long, compile error
    Point.print(Long.valueOf("10"));
    Point.print((long) 10);



    if (Long.valueOf("100") < 101) {
      // convert Long 100 -> Long 100
      // 101->int
      // long vs int
    }

    if (Boolean.valueOf(false).equals(false)) { // or ==
      // right: false -> boolean
      // left: Boolean false -> Boolean false
      // boolean vs boolean
    }
    // unbox long, and upcast int
    System.out.println(l == i); // true, finally long == int
    // Big bughere
    Integer i2 = 1;
    System.out.println(Objects.equals(l, i)); // false
    System.out.println(Objects.equals(l, Long.valueOf(i))); // true
    //.equals幫你check埋null (String null 不能.equal/ defense)


  }

  public static void print(Long l) {
    System.out.println("l = " + l);

  }

}
