package Crash;

public class X extends Y {

  private String name;

  public X() {
    
  }

  public X(String name) {
    super("John");
    this.name = name;
  }

  //////////////////////// Constructor ///////////////////////

  public String getName() {
    return this.name;
  }

  public String getParentName() {
    return super.getName();
  }

  public static void staticMethod() {
    System.out.println("I am X");
  }

  //////////////////////// Method ///////////////////////
  public static void main(String[] args) {
    X x = new X("Peter");
    System.out.println(x.getName()); // Peter
    System.out.println(x.getParentName()); // John
    // System.out.println("((Y) x)" + ((Y) x).name);


    // Hiding
    Y y = new X("Tommy");
    y.staticMethod(); // I am Y, Hiding
    // You should practice and understand below syntex
    Y.staticMethod(); // I am Y
    X.staticMethod(); // I am X
    System.out.println(y.getName()); // Tommy



  }

}
