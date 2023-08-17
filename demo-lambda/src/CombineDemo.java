

import java.util.function.Predicate;

public class CombineDemo {

  public static void main(String[] args) {
    Predicate<String> startWithV = s -> s.startsWith("V");
    Predicate<String> endWithE = s -> s.endsWith("E");
    Predicate<String> combine = startWithV.and(endWithE); // can make it long

    System.out.println(combine.test("VE")); // true
    System.out.println(combine.test("AE")); // false
    System.out.println(combine.test("AE")); // false

    Predicate<String> combine2 = startWithV.or(endWithE);
    System.out.println(combine2.test("AE"));// true
    System.out.println(combine2.test("VQ"));// true



  }


}
