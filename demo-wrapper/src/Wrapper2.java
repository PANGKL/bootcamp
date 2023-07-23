public class Wrapper2 {
  public static void main(String[] args) {
    // auto-boxing
    Integer i = 10;
    Integer i2 = 10; // auto-boxing
    Integer i3 = Integer.valueOf(10);


    int i4 = i2; // unboxing


    char c = 'a';
    Character c2 = c;
    char c3 = c2; // auto-unboxing

    byte b = 1;
    Byte b2 = b;
    byte b3 = b2;

    long l4 = 100;
    Long l44 = l4;
    // Long l4 = 100; //can not int change to big Long
    // long -> Long (ok)
    // int -> long (ok)
    // int -> Long (X)
    long l = 10;
    Long l2 = l;
    long l3 = l2;



  }

}
