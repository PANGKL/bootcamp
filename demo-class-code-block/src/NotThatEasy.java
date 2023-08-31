import java.util.ArrayList;
import java.util.List;

public class NotThatEasy {
  static final List<Character> characters = method();//
  private static final char[] chars = {'J', 'a', 'c', 'k', 'y'};
  final int x = method2();

  static {
    System.out.println("I am static code block"); // main行一次
    // characters = new ArrayList<>();
  }

  static int method2() {
    System.out.println("I am static method, called by instance var");
    return 1;
  }

  static List<Character> method() {
    System.out.println("I am static method, called by static var");
    return new ArrayList<>();
  }

  // Object initialization code block
  {
    // characters.add('V');
    System.out.println("I am initialization code block");
  }

  public static void main(String[] args) {
    // Once you click the run button:
    // 1. Compile
    // 2. Run -> Class loader -> stack memory
    System.out.println("Start of main");
    NotThatEasy obj = new NotThatEasy();

  }


}
