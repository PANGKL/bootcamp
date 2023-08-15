package comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Card extends Paper {

  int number;

  public Card(int number, int size) {
    super(size);
    this.number = number;
  }

  @Override
  public String toString() {
    return "[number = " + this.number + ", "//
        + "size = " + super.size + "]";
  }

  public static void main(String[] args) {
    // Card card = new Card();

    List<Card> cards = Arrays.asList(new Card(1, 2), new Card(12, 3));
    Collections.sort(cards, new SortBySize());
    System.out.println(cards.toString());

    List<? extends Number> numbers = new ArrayList<>(); // provide more 彈性to new obj
    // List<Number> numbers = new ArrayList<>(); // provide more 彈性to new obj
    // 鑽石入面不能講繼承關係

    numbers = new ArrayList<Double>();

    Number number = Integer.valueOf(1); // 有caching run faster
    number = new Double(0);// Normal polymorphism


  }



}
