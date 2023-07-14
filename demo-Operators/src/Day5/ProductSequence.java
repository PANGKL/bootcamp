package Day5;

public class ProductSequence {
  public static void main(String[] args) {
    // 0,1,2,3,4,5
    // print out 0,2,6,12,20
    int newcount = 0;
    for (int i = 0; i <= 20; i++) {
      newcount = i * (i + 1);
      System.err.print(newcount + ", ");
    }

    System.out.println();

    int a, b;
    for (int i = 0; i < 20; i++) {
      a = i;
      b = i + 1;
      System.out.print(a * b + ", "); // math can print * on system out
    }



  }

}
