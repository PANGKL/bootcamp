import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestVector {
  List<Integer> integers = new Vector<>();

  public static void main(String[] args) {
    TestVector list = new TestVector();

    Runnable addInteger = () -> {
      for (int i = 0; i < 10000; i++) {
        list.integers.add(i);
      }
    };



    Thread thread1 = new Thread(addInteger);
    Thread thread2 = new Thread(addInteger);
    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(list.integers.size());

  }
}
