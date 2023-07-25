import java.util.Arrays;

public class String2 {
  public static void main(String[] args) {
    // method signature = method name + parameter type & quantity
    // trim(),remove leading space and trail space **
    String str = "hello world";
    String str2 = " hel   lo ";
    System.out.println("str.trim() = " + str.trim());
    System.out.println("str2.trim() = " + str2.trim());

    // startWith(), check if the string start with the target string **
    if (str.startsWith("hell")) {
      System.out.println("The string starts with hel");
    }

    // endsWith(), check if the string ends with the target string
    boolean endsWithspace = str.endsWith(" ");
    if (endsWithspace == true) {
      System.out.println(endsWithspace);
    }

    // *** indexOf(char) first index of
    System.out.println("The index of o in str = " + str.indexOf('o')); // 4
    System.out.println("The index of ll in str = " + str.indexOf("ll")); // 2
    System.out.println("The index of ll in str = " + str.indexOf("lll")); // -1 （not found)
    System.out.println("The index of o in str, search from index 10 = "
        + str.indexOf('o', 10)); // -1
    System.out.println("The index of ll in str, search from index 3 = "
        + str.indexOf("ll", 3)); // -1

    System.out.println("The last index of o in str " + str.lastIndexOf('o')); // 7 由尾數上黎
    System.out.println("The last index of o in str, search from 7, index = "
        + str.lastIndexOf("o", 9)); // 7
    System.out.println("The last index of ll in str " + str.lastIndexOf("ll")); // 7 由尾數上黎


    String str3 = "Hello";
    System.out.println(str3.lastIndexOf('l'));
    System.out.println(str3.lastIndexOf("ll"));
    System.out.println(str3.lastIndexOf('l', 3)); // 3

    // charAt() -> 知index 搵 char
    // indexof() -> 知char 搵 index


    String s = "Java is a programming lanuage";
    String s1 = s.replace('s', 'd');
    System.out.println(s1);
    System.out.println(s.replace("Java", "Python")); // CharSequence = String
    // (a,b) a == target, b == replacement
    System.out.println(s.replace('p', 'q'));

    // equals(), equalsIgnoreCase()
    if ("hello".equals(str3)) { // case sensitive
      System.out.println("str 3 = hello");
    }

    if ("hello".equalsIgnoreCase(str3)) { // true, non case sensitive, 不理大細楷
      System.out.println("non case senstitive checking ");
    }

    if ("HELLO".equals(str3.toUpperCase())) { // seems like equalsIngoreCase
      System.out.println("Alternative");
    }


    // cncat(String), append something
    String newString = str3.concat(" Java!"); // ** operation
    str3 += "java";
    str3 = str3.concat(" HAHAHA");
    System.out.println("newString = " + newString);
    System.out.println("newString = " + str3);

    // compareTo
    String apple = "apple";
    String facebook = "lacebook";
    System.out.println(apple.compareTo(facebook)); // -5, 97 - 102 ('a' - 'f') ASCII base



    
    String str0 = "hello";
    char[] arr = str0.toCharArray();
    System.out.println(Arrays.toString(arr));
    // [h, e, l, l, o]
    System.out.println(new String(arr));
    // hello
    System.out.println(String.valueOf(arr));
    // hello



  }

}
