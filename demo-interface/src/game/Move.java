package game;

// Before Java8, 100% abstraction
public interface Move {


  // Constant , no nessary to set instance variable
  static final int SPEED = 10;

  // Java -> naming convention -> Camlcase
  // "noOfDay" 駝峰 spring boot will use

  // Behavior
  // void up(); // public abstract

  // void down(); // public abstract

  // void left(); // public abstract

  // void right(); // public abstract
  void jump();

  // void setcount()；
  // No method implementions

  // After Java 8. lambda, stream (week6)
  //借Move interface 給自己起default method , 不會影響其他class，upgrade 兼容性
  default void print() { // intance method, implicitly public
    System.out.println("I am Java 8 default method");
  }

  static String concat(String a, String b) {
    return a + b;
  }



}
