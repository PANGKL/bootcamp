import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;
import javax.swing.text.html.Option;

public class Superman implements Flyable {
  @Override
  public void fly() {
    System.out.println("I am flying");
  }

  public static void main(String[] args) {
    // 3 ways to new flyable object
    // 1. Polymorphism
    Flyable superman = new Superman();

    // 2. Anonymous
    Flyable superman2 = new Flyable() {
      @Override
      public void fly() {
        System.out.println("I am anonyums");
      }
    };

    // 3. Lambda
    Flyable superman3 = () -> System.out.println("I am Lambda");
    superman3.fly();



    Optional<String> str = Optional.ofNullable("abc");
    // int num =0;
    str.ifPresent(e -> { // cannot modify variable of outside
      // sum++;
      // String s = " ";
    });
    // s = s+ "hello"

    int total = 0;
    if (str.isPresent()) { // can modify variable of outside
      total++;
    }


    int t = 0;
    Arrays.asList(1, 2, 3, 4).stream()//
        .count(); // 4


  }


  public static double add(double a, double b) {
    return BigDecimal.valueOf(a).add(BigDecimal.valueOf(b)).doubleValue();
  }



}
