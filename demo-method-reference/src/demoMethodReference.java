import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class demoMethodReference {

  public static void main(String[] args) {
    Consumer<String> sysout = s -> System.out.println(s);
    Consumer<String> sysout2 = System.out::println; // static method

    Arrays.asList("abc", "def").forEach(sysout2);
    sysout2.accept("wewe");


    String name = "join";
    Supplier<Integer> strLength = () -> name.length();
    Supplier<Integer> strLength2 = name::length;


    List<String> words = Arrays.asList("apple", "orange", "banana");
    Comparator<String> compare = (s1, s2) -> s1.compareTo(s2);
    Comparator<String> compar2 = String::compareTo;


    Function<String, Integer> convert = str -> Integer.valueOf(str);
    Function<String, Integer> convert2 = Integer::valueOf;


  }
}
