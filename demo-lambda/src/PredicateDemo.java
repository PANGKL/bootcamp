

import java.time.LocalDate;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

  public static void main(String[] args) throws Exception {

    // Predicate
    Predicate<Character> isMale = c -> c == 'M';
    Predicate<String> isUpperCase = s -> {
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) < 65 || s.charAt(i) > 90)
          return false;
      }
      return true;
    };
    System.out.println(isMale.test('F'));

    test(isMale, 'M', true);
    test(isMale, 'F', false);
    test(isUpperCase, "aADbd", false);
    test(isUpperCase, "SSDSD", true);

    // BiPredicate

    BiPredicate<String, String> equals =
        (s1, s2) -> s1 != null && s1.equals(s2); // s1 can not be null to .equal
    test(equals, null, null, false);
    test(equals, "", null, false);
    test(equals, "", "", true);
    test(equals, " ", null, false);



    Predicate<LocalDate> iscoolingOff =
        effDate -> effDate.plusMonths(1).isAfter(LocalDate.now());
    test(iscoolingOff, LocalDate.of(2023, 07, 16), false);
    test(iscoolingOff, LocalDate.of(2023, 07, 21), true);

  }


  public static <T> void test(Predicate<T> testcase, T data,
      boolean expectedResult) throws Exception {
    if (testcase.test(data) == expectedResult)
      return;
    throw new Exception();
  }

  

  public static <T, U> void test(BiPredicate<T, U> testcase, T data, U data2,
      boolean expectedResult) throws Exception {
    if (testcase.test(data, data2) == expectedResult)
      return;
    throw new Exception();
  }


  


}
