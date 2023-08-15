package comparator;
import java.util.Comparator;

public class SortBySize implements Comparator<Card> {


  @Override
  public int compare(Card o1, Card o2) {
    return o2.size > o1.size ? 1 : -1;
  }



}
