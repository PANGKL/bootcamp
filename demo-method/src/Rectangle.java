public class Rectangle {

  public static double area(double x, double y) {
    return x * y;

  }

  public static double perimerter(double x, double y) {
    return 2 * (x + y);
  }



  public static void main(String[] args) {
    double area = area(5.0d, 3.0d);
    double area2 = area(13.0d, 5.0d);
    double perimerter = perimerter(10.0d, 90.0d);
    double perimerter2 = perimerter(55.0d, 44.0d);


    System.out.println(area);
    System.out.println(area2);
    System.out.println(perimerter);
    System.out.println(perimerter2);

  }

}
