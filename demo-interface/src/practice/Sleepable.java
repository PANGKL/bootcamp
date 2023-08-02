package practice;

public interface Sleepable {
  void sleep();

  default void print(){
    System.out.println("ZZZZZZ......");
  }


  public static void sleepOnce(Sleepable[] sleep) {
    for (Sleepable s : sleep) {
      s.sleep();
    }
  }
  
}
