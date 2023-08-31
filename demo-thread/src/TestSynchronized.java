public class TestSynchronized {

  int number;

  public synchronized void increment() { // 鎖method like "Atomic" method
    this.number++; // non-atomic method
  }

  public static void main(String[] args) {

    // lock method

    TestSynchronized t = new TestSynchronized();
    Runnable concat = () -> {
      for (int i = 0; i < 100000; i++) {
        t.increment();; // concat() - non-atomic operation
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

    System.out.println(t.number);


  }

}
