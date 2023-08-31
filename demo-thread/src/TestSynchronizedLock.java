public class TestSynchronizedLock {

  int x;
  Object lock1 = new Object();
  // Object lock2 = new Object();


  public int calculate(int amount) {
    int total = amount;
    synchronized (this.lock1) {
      this.x++; // minimize coding
    }
    // can be more than one syn code block
    return total + this.x;
  }

  // public synchronized void increment() {
  // }

  public static void main(String[] args) {
    TestSynchronizedLock obj = new TestSynchronizedLock();

    Runnable concat = () -> {
      for (int i = 0; i < 1000; i++) {
        obj.calculate(0); // concat() - non-atomic operation
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

    System.out.println(obj.x);



  }

}
