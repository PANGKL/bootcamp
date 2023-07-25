public class Integer3 {


  // Internal Cache (-128 to 127)
  public static void main(String[] args) {
    Integer i1 = 100;
    Integer i2 = 100;
    System.out.println(i1 == i2); // address , true

    Integer i3 = 127;
    Integer i4 = 127;
    System.out.println(i3 == i4); // address, true

    Integer i5 = -128;
    Integer i6 = -128;
    System.out.println(i5 == i6); // address, true

    Byte b1 = 127;
    Byte b2 = 127;
    System.out.println("Byte " + (b1 == b2));
    // Byte b2 = new Byte(null)

    Boolean bool1 = false;
    Boolean bool2 = false;
    System.out.println(bool1 == bool2); //

    // Internal Cache -> ASCII
    Character c1 = 'a';
    Character c2 = 'a';
    Character c3 = 'Ϩ';
    Character c4 = 'Ϩ';

    System.out.println("char c1 c2 " + (c1 == c2)); // true, same address
    System.out.println("char c3 c4 " + (c3 == c4)); // false


    ////////// no cache ///////////////////////////////////////////////////////////////////
    Short s1 = 1000;
    Short s2 = 1000;
    System.out.println("short " + (s1 == s2)); // true, same address

    Short l1 = 1000;
    Short l2 = 1000;
    System.out.println("Short " + (l1 == l2));

    Double d1 = 10.3d;
    Double d2 = 10.3d;
    System.out.println("Double " + (d1 == d2));

    Float f1 = 5.5f;
    Float f2 = 5.5f;
    System.out.println("Float " + (f1 == f2));

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    Integer i7 = Integer.valueOf(127);
    Integer i8 = 127;
    System.out.println(i7 == i8); // true


    // input int
    // check is or not in range of internal cache
    Integer i9 = Integer.valueOf(128);
    Integer i10 = 128;
    System.out.println(i9 == i10); // false



  }

}
