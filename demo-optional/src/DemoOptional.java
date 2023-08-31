import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoOptional {

  public static void main(String[] args) throws Exception {


    // Optional<Book> -> Book -> String
    Optional<Book> o = getBook(); // call method
    if (!o.isPresent()) {

    }

    o.ifPresent(e -> {
    });


    List<Book> books = new ArrayList<>();
    books.add(new Book("John"));
    books.add(new Book("Mary"));
    books.add(new Book("Peter"));

    Optional<Book> book = books.stream()//
        // .filter(e -> e.author.startsWith("T"))//
        .findAny(); // return Option<Book>

    // List<Book> b2 = book.stream().collect(Collectors.toList());
    System.out.println(book.get());
    System.out.println(book.isPresent());


    // Optional -> user can double confirm weather value is null
    // To avoid nullPointerException
    if (book.isPresent()) {
      System.out.println(book.get());
    } else {
      System.out.println("No such Books");
    }

    Optional<Book> book2 = Optional.of(new Book("Eric"));
    // Optional<Book> book3 = Optional.of(null); // run time error
    Optional<Book> book4 = Optional.ofNullable(null);
    System.out.println("book4"+book4.isPresent()); // false
    Optional<Book> book5 = Optional.ofNullable(new Book("Jenny"));

    Optional<Book> book6 = Optional.empty();
    System.out.println(book6.isPresent()); // false

    Optional<Book> book7 = null; // cannot . any method


    // Optional<Book> -> Book
    Book newBook = book6.orElse(new Book("Default"));
    Book newbook2 = book6.orElseGet(() -> new Book("default"));
    // Book newbook3 = book6.orElseThrow(() -> new Exception());



  }

  public static Optional<Book> getBook() {
    // get book logic..
    return Optional.ofNullable(null);
  }



}
