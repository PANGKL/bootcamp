

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
  public static void main(String[] args) {
    Consumer<String> consumer = str -> System.out.println(str); // void obj only
    consumer.accept("I love Java");

    BiConsumer<String, String> consumer2 =
        (s1, s2) -> System.out.println(s1 + s2);
    consumer2.accept("abc", "def");

    List<String> strings = new ArrayList<>();
    strings.add("dog");
    strings.add("cat");
    strings.add("cow");
    strings.forEach(s -> {
      int i = 0;
      if (i < 1)
        System.out.println(s);
    });

    int total = 0;
    for(int s: Arrays.asList(2,3,4,2)){
      total += s;
    }
    System.out.println(total);



    Map<String, Integer> fruit = new HashMap<>();
    fruit.put("orange", 3);
    fruit.put("lemon", 2);
    fruit.put("apple", 10);
    fruit.put("waterlemon", 5);
    fruit.forEach((key, value) -> {
      if ("lemon".equals(key))
        System.out.println(key + " : " + value);
    });



  }



}


