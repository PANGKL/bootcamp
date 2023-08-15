import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class DemoSorting {
  public static void main(String[] args) {
    int[] arr = new int[] {4, 1, 10, 23, 2, -31, -23};
    Arrays.sort(arr); // n * logn, merge sort
    System.out.println(Arrays.toString(arr));

    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(100);
    arrayList.add(-100);
    arrayList.add(800);
    arrayList.add(400);

    Collections.sort(arrayList); // n log n
    System.out.println(arrayList); // [-100, 100, 400, 800]



    ArrayList<Ball> balls = new ArrayList<>();
    balls.add(new Ball(4, Color.YELLOW));
    balls.add(new Ball(1, Color.BLUE));
    balls.add(new Ball(5, Color.Red));
    balls.add(new Ball(100, Color.YELLOW));
    balls.add(new Ball(33, Color.YELLOW));

    Collections.sort(balls);
    System.out.println(balls.toString());



    ArrayList<Ball> balls1 = new ArrayList<>();
    balls1.add(new Ball(4, Color.Red));
    balls1.add(new Ball(1, Color.BLUE));
    balls1.add(new Ball(5, Color.Red));
    balls1.add(new Ball(100, Color.Red));
    balls1.add(new Ball(33, Color.Red));


    Collections.sort(balls1);
    System.out.println(balls1.toString());



  }


}
