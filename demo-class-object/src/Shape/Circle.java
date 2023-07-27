package Shape;

public class Circle {
  private double radius;
  private int id; // instance var
  // static -> share
  // instance(non static) -> every method get one attirubute
  // final -> only one initialization
  private static final double pi = 3.14159; //
  private static final int Jan = 30;
  private static final int Feb = 28;
  private static int counter;

  public Circle() { // empty constructor addd counter Constructor can call method
    addCounter(); // static , so only one counter
    this.id = counter; // each obj get one id;
  }

  public static void addCounter() {
    counter++;
  }

  // public Circle()
  public int getID() {
    return this.id;
  }

  public static double getPi() {
    return pi;
  }



  public double area() {
    return Math.pow(this.radius, 2) * pi;
  }

  public double circumference() { // instance method / obj method
    return 2 * this.radius * 3.14159; // no prefer 3.14159 , 精準問題

  }


  public void setRadius(int radius) {
    this.radius = radius;
  }



  public static void main(String[] args) {

    Circle c1 = new Circle(); // pr
    c1.setRadius(3);
    System.out.println(c1.area());
    System.out.println(c1.circumference());
    Circle c2 = new Circle(); // pr



    System.out.println(counter);
    System.out.println(c1.getID());
    System.out.println(c2.getID());



  }

}
