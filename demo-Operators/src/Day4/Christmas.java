public class Christmas {
  public static void main(String args[]) {

    for (int i = 0; i < 10; i++) {
      for (int space = 0; space < 10 - i; space++) {
        System.out.print("@");
      }
      for (int star = 0; star < i * 2 - 1; star++) {
        System.out.print("*");
      }
      System.out.println();
    }



    for (int j = 0; j < 8; j++) {
      for (int space2 = 0; space2 <= j + 1; space2++) {
        System.out.print(" ");
      }
      for (int star2 = 16; j < star2 / 2; star2--) {
        System.out.print("*");
      }
      System.out.println();

    }


  }


}

