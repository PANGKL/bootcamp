/**
 * Expected Output: J e 3 9 10 ab c VenturenixLAB, Coding 19 ren VENTURENIXLAB, JAVA venturenixlab, java V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    // prints e (the 1st e)
    // code here ...

    System.out.println(str.charAt(str.indexOf("J")));
    System.out.println(str.charAt(str.indexOf("e", 0)));



    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    // code here ...
    System.out.println(str.indexOf(str.charAt(3)));
    System.out.println(str.indexOf(str.charAt(9)));
    System.out.println(str.indexOf(str.charAt(10)));


    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    // Use String replace() method
    // prints VenturenixLAB, Coding
    // code here ...

    abc = abc.trim();
    System.out.println(abc);
    abc = abc.replace("ab c", "VenturenixLAB, Coding");
    System.out.println(abc);

    // int length()
    // prints 19
    // code here ...
    System.out.println(abc.length() - 2);

    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...

    System.out
        .println(abc.substring(abc.indexOf("r"), abc.indexOf("n", 4) + 1));

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    // code here ...
    abc = abc.replace("Coding", "JAVA");
    abc = abc.toUpperCase();
    System.out.println(abc);
    System.out.println(abc.toLowerCase());


    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...
    System.out.println(abc.replace('E', '*').replace("JAVA", "JAVA!!!"));

  }
}
