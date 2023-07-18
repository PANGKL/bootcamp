public class Circle {

  public static double area(double radius) {
    return radius * radius * 3.14159;
  }

  public static double perimerter(double radius) {
    return 2 * radius * 3.14159;
  }

  public static void main(String[] args) {
    double area = area(4.3d);
    double perimerter = perimerter((4.3d));

    System.out.println(area);
    System.err.println(perimerter);
    String area1 = area.substring(0, 4);
  }

}
