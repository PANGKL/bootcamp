package practice;

public interface Climbable {

  void climb();


  public static void climbOnce(Climbable... climb) {
    for (Climbable s : climb) {
      s.climb();
    }
  }
  
}
