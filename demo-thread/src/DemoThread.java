public class DemoThread {

  public static void main(String[] args) {
    // Apporach 1 : Runnable to implement Thread
    // Task Logic
    Runnable printout = () -> {
      for (int i = 0; i < 100; i++)
        System.out.println("i = " + i);
    };
    // Task
    Thread thread = new Thread(printout); // Task Management
    System.out.println("Start Thread 1"); // step 1
    thread.start(); // step 2
    System.out.println("End Thread 1"); // step 3


    // if no Java 1.8
    // Apporach 2 : Create Print Class implement Runnable
    Thread thread2 = new Thread(new PrintOut());
    System.out.println("Start Thread2"); // step 1
    thread2.start(); // step 2
    System.out.println("End Thread2"); // step 3

    // Apporach 3: Create PrintOut2 Class extends Thread
    Thread thread3 = new Thread(new PrintOut2());
    thread3.start(); // step 2


    try {
      thread.join();
      thread2.join();
      thread3.join();
    } catch (InterruptedException e) {

    }
    System.out.println("Main Thread Ends");

  }


}
