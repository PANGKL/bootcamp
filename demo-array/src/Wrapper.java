public class Wrapper {
  public static void main(String[] args) {
    // Primitives: bytes, short ...
    // Wrapper Class, corresponding primitive

    boolean isMale = true; // isMale is not object
    Boolean isFemale = true; // isFeale is object reference

    isMale = false;
    if (isMale == false) {

    }
    if (isFemale.compareTo(isMale) == 0) {
      // asking if isFemail with the same value of isMale
    }
    
    isFemale = null; // true/false/null
    // isMale = null;
    int num = 2;
    Integer num2 = 4;
    // num2 = null;

    String s = num2.toString();
    Integer i = Integer.valueOf("123");

    char c = 'a';
    Character c2 = 'A';
    char result = Character.toLowerCase('B');


    Integer num3 = 4;

    if (num3.compareTo(3) > 0) {
      System.out.println("num3 is > 3");
    }

    // Difference?
    Character c3 = Character.valueOf('s');
    Character c4 = 's';



  }

}
