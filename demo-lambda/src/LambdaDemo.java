

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import hashmap.HasMapPractice;

public class LambdaDemo {

  // public static int strlength(String ){

  // }

  public static void main(String[] args) {
    Function<String, Integer> lengthFunc = str -> str.length();
    Function<String, Character> firstCharFunc = str -> str.charAt(0);

    System.out.println(lengthFunc.apply("harry"));
    System.out.println(firstCharFunc.apply("harry"));

    LenngthFunction lenngthFunction = new LenngthFunction();
    System.out.println(lenngthFunction.apply("pkl"));


    Map<String, String> map = new HashMap<>();
    map.put("abc", "Mary");
    Function<String, String> formula = s -> "default";
    String result = map.computeIfAbsent("def", formula); // if no, input key and value
    // String result = map.computeIfAbsent("def", s -> "nonono");

    System.out.println(result);
    System.out.println(map.size());


    // BiFuction
    BiFunction<Integer, Integer, BigDecimal> addiction =
        (x, y) -> BigDecimal.valueOf(x + y);
    System.out.println(addiction.apply(-7, 9).abs());

    // map.compute("wewe", (s1, s2) -> "value"); // 有key就replace，無就put
    // System.out.println(map.size()); // 3
    // map.compute("wewe", (s1, s2) -> "another"); // replace
    // System.out.println(map.size()); // 3
    // map.get("wewe");

    // map.compute("wewe", (s1, s2) -> null);
    // System.out.println(map.size());


    Map<String, Integer> stock = new HashMap<>();
    stock.put("clothes", 100);


    stock.compute("clothes",
        (item, oldPrice) -> (int) (oldPrice - oldPrice * 0.1));  // recompute value
    System.out.println(stock.get("clothes")); // 90

    // new value: null, remove item
    stock.compute("clothes", (item, oldPrice) -> null); // change and key value too null
    System.out.println(stock.size()); // 0

    stock.compute("shoes", (item, oldPrice) -> 120);  // check if not key
    System.out.println(stock.get("shoes")); // 120
    System.out.println(stock.size()); //1



  }

}
