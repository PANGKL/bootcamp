public class TestString {

  String str = "";


  public static void main(String[] args) {

    TestString t = new TestString();
    Runnable concat = () -> {
      for (int i = 0; i < 100000; i++) {
        t.str = t.str.concat("s"); // concat() - non-atomic operation
      }
    };
    Thread t1 = new Thread(concat);
    Thread t2 = new Thread(concat);


    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {

    }

    System.out.println(t.str.length());



  }

}
