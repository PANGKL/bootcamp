package hashset1;

import java.util.HashSet;

public class DemoHashSet {
  //
  public static void main(String[] args) {

    // HashSet is good at handling duplicates
    //
    HashSet<String> string = new HashSet<>(); // 消除duplicate
    System.out.println(string.add("abc")); // true
    System.out.println(string.add("def")); // true
    System.out.println(string.size());// 2
    boolean result = string.add("abc");
    System.out.println(string.size()); // 2
    System.out.println(result); // false

    if (string.add("def")) {
      System.out.println("def is added");
    } else {
      System.out.println("def is not added");
    }

    // Example 2: With Override method
    HashSet<Coordinate> coordinates = new HashSet<>();
    Coordinate c1 = new Coordinate(1, 1);
    Coordinate c2 = new Coordinate(1, 1);
    System.out.println(coordinates.add(c1)); // true
    System.out.println(coordinates.add(c2)); // false
    // HashSet add() -> Coordinate c2.equals(any of coordinates in hashset)
    // -> c2.equals(c1) -> true
    // -> hashSet not allow duplicates
    // -> return false
    System.out.println(coordinates.size()); // 1
    Coordinate c3 = new Coordinate(2, 1);
    System.out.println(coordinates.add(c3)); // true
    System.out.println(coordinates.size()); // 2

    // Example 3 :Without Override method
    HashSet<Book> book = new HashSet<>();
    System.out.println(book.add(new Book("author", "Eric"))); // true
    System.out.println(book.add(new Book("author", "Eric"))); // true, diff address
    System.out.println(book.add(new Book("author", "Steven"))); // true , diff address

    System.out.println();



  }
}
