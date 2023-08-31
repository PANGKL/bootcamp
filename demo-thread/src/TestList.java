import java.util.LinkedList;
import java.util.List;

public class TestList {
  List<Integer> integers = new LinkedList<>();

  public static void main(String[] args) {
    TestList list = new TestList();

    Runnable addInteger = () -> {
      for (int i = 0; i < 1000000; i++) {
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
