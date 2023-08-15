package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import hashset1.Book;

public class HasMapPractice {



  public static void main(String[] args) {
    HashMap<Author, Book> ash1 = new HashMap<>();
    Author a1 = new Author("Peter", 30);
    Author a2 = new Author("May", 30);
    ash1.put(a1, new Book("baby", "boook2"));
    ash1.put(a2, new Book("baby", "boook2"));
    System.out.println(ash1.size());

    HashMap<Author, ArrayList<Book>> ash2 = new HashMap<>();
    ArrayList<Book> book1 = new ArrayList<>();
    book1.add(new Book("11", "1223"));
    book1.add(new Book("11", "1223"));
    ArrayList<Book> book2 = new ArrayList<>();
    book2.add(new Book("21", "2222"));
    book2.add(new Book("22", "2222"));

    ash2.put(a1, book1);
    ash2.put(a2, book2);

    for (Map.Entry<Author, ArrayList<Book>> s : ash2.entrySet()) {
      for (Book ss : s.getValue()) {
        System.out.println(s.getKey().getName() + ss.toString());

      }
    }



  }



}
