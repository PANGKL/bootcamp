import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomicInteger {

  AtomicInteger number = new AtomicInteger(0);
  // int number;

  public static void main(String[] args) {
    TestAtomicInteger i = new TestAtomicInteger();
    // i.number++; // Non-Atomic Operation
    // System.out.println(i.number);

    Runnable increament = () -> {
      for (int x = 0; x < 1000; x++) {
        i.number.incrementAndGet();// Atomic Opertation
      }
    };

    Thread thread1 = new Thread(increament);
    Thread thread2 = new Thread(increament);

    thread1.start();
    thread2.start();
    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {

    }


    System.out.println(i.number);

    
  }


}
