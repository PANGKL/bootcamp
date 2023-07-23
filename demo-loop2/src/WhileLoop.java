public class WhileLoop {
  public static void main(String[] args) {
    int count = 0;
    while (count < 5) { // continue condition: true / false
      count++; //
      System.out.println("hello");
    }
    // count = 5
    boolean isHoliday = false; // much better
    count = 0;
    while (!isHoliday) { // if true, exit the loop //
      count++;
      if (count >= 6) { // 某條件下先++,通常不會--
        isHoliday = true;
      }
    }

    int c = 0;
    while (c >= 0 && c < 5) { // 少用||,左右overlap , 除非有兩個count 進行不同條件
      System.out.println(c);
      c++;
    }

    int a = 0;
    int b = 10;
    while (a < 5 || b > 0) {
      System.out.println("hello");
      a++;
      b--;
    }

    int k = 0;
    while (k < 6) {
      System.out.println("break hello");
      k++;
      if (k > 3) {
        break;
      }
    }


    // continue
    int j = 0;
    while (j < 6) {
      j++;
      if (j > 3) {
        continue; // 避開某d coding //後面一定要有野
      }
      System.out.println("continue: hello");
    }


  }
}
