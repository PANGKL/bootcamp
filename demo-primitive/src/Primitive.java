public class Primitive {

  public static void main(String[] args) {
    // correct Syntax
    // Upcasting ( Implicit conversion) background
    // byte -> short -> int -> long -> double
    byte b = 2;
    short s = b;
    int i = s;
    long l = i;
    float f = l;
    double d = f;

    // char -> int
    char c = 'A';
    int j = c;

    // Downcasting
    double d2 = 10.3d;
    // float f2 = d2 // error, java not allow 精度損失
    float f2 = (float) d2; // developer take own respnsibilty for the risk


    short s2 = 128;
    byte b2 = (byte) s2;
    System.out.println("b2= " + b2);


    // int[] arr = new int[Integer.MAX_VALUE];
    // for (byte k = 127; k < 129; k++) { // 128 -> -128
    // System.out.println("hello");
    // }

    char c2 = 'B'; // 66 , can compare with number
    if (c2 == 66) {
      System.out.println("c2 is 66");
    }

    char c3 = 67;
    if (c3 == 'C') {
      System.out.println("c3 is 67");
    }

    // ASCII (int) to char
    int g = 'a';
    int g2 = 10; //
    char p = (char) g2; // Explicit conversion / downcasting
    char k2 = 66; // downcast char同數字相通, 默認 66 is ASCII code 

    System.out.println(k2);

    //
    int h = (int) 1000L;
    short t = 128;
    byte oo = (byte) t; // complier would not check
    // byte o = 128; // auto checking

    char character = 'a' + 1;  
    if (character == 'b') {
      System.out.println("character = " + character);
    }
    if (character == 98) {
      System.out.println("character = " + character);
    }

    if (character > 'a') {
      System.out.println("character > a");
    }


  }

}
