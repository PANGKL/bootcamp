import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByColor implements Comparator<Ball> {

  @Override
  public int compare(Ball b1, Ball b2) {
    return b2.color.id < b1.color.id ? 1 : -1;
  }

  public static void main(String[] args) {

    ArrayList<Ball> balls1 = new ArrayList<>();
    balls1.add(new Ball(4, Color.Red));
    balls1.add(new Ball(1, Color.BLUE));
    balls1.add(new Ball(5, Color.Red));
    balls1.add(new Ball(100, Color.Red));
    balls1.add(new Ball(33, Color.Red));
    Collections.sort(balls1, new SortByColor());
    
    System.out.println(balls1.toString());
  }

}
