public class String1 {
  public static void main(String[] args) {
    // length(), equals(), charAt()
    String str = "Hello";
    System.out.println(str.isEmpty()); // true of false
    String str2 = ""; // empty string
    System.out.println(str2.isEmpty()); // true
    String str3 = " ";
    System.out.println(str3.isEmpty()); // false, space also count charactor

    // blank
    System.out.println(str.isBlank()); // false
    System.out.println(str2.isBlank()); // true
    System.out.println(str3.isBlank());// true , is blank if even space charactor

    // toLowerCase(), toUpperCase()
    System.out.println(str.toUpperCase()); // HELLO
    System.out.println(str); // hello
    System.out.println(str.toUpperCase().toLowerCase()); // hello
    if (str.toUpperCase().equals("HELLO")) {
      System.out.println("yes, it is HELLO");
    }



    // substring
    // start index, normal index,
    // end index, last index +1
    // hello -> he
    System.out.println(str.substring(0, 2)); // begin index to end index -1
    System.out.println(str.substring(2, 3)); // begin index to end index -1
    System.out.println(str.substring(0, 5)); // begin index to end index -1

    System.out.println(str.substring(0)); // hello
    System.out.println(str.substring(3)); // lo

    if (str.substring(3).equals("lo")) {
      System.out.println("Yes, str.substring(3) = lo");
    }



    // contains()
    String s = "lo";
    System.out.println(str.contains(s)); // true (hello contains lo)
    System.out.println(str.contains("ol")); // false( hello not contain ol) include space

    if (str.contains(s)) {
      System.out.println("str contains lo");
    }


    str = str.toUpperCase();
    System.out.println(str); // HELLO
    str += str.toLowerCase();
    System.out.println(str);// HELLOhello


  }
}
