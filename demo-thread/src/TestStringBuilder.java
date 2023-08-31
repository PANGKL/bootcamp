public class TestStringBuilder {
  public static void main(String[] args) throws InterruptedException {
    StringBuilder sb = new StringBuilder("");
    //sbuilder (reference ) -> object (StringBuilder Object) -> Objec (Array)
    StringBuffer sb2 = new StringBuffer();

    Runnable appendS = () -> {
      for (int i = 0; i < 100; i++) {
        sb2.append("s");
      }
    };



    Thread thread1 = new Thread(appendS);
    Thread thread2 = new Thread(appendS);
    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(sb.length());
    System.out.println(sb2.length());
  }

}
