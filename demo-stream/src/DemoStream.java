import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {

  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("abc");
    strings.add("ghi");
    strings.add("def");

    // for-each
    // for (String s : strings) {
    // System.out.println(s);
    // }
    // List convert to Stream
    Stream<String> streamStrings = strings.stream();
    // Filtering ses
    streamStrings = streamStrings.filter(s -> s.startsWith("a"));
    // Stream.forEach
    streamStrings.forEach(s -> System.out.println(s));


    strings.stream().filter(s -> s.endsWith("i"))
        .forEach(s -> System.out.println(s));


    List<String> strings2 = strings.stream()//
        .filter(s -> s.length() == 3)//
        .collect(Collectors.toList());

    System.out.println(strings2);
    System.out.println(strings2.size());

    List<Integer> lengths = strings2.stream() // stream<String>
        .filter(s -> s.startsWith("a") || s.startsWith("d"))//
        .map(e -> e.length()) // Stream<Integer>
        .collect(Collectors.toList()); // List<Integer>


    lengths.forEach(e -> System.out.println(e));


    strings2.stream()//
        .sorted((s1, s2) -> s2.compareTo(s1)) // descending order
        .forEach(e -> System.out.println(e));


    if (strings2.stream().anyMatch(e -> e.startsWith("a"))) {
      System.out.println("One of the element starts with a");
    }


    // interminate operations;
    // filter(), map(), sorted(), anyMatch()

    // terminated operations;
    // collect(), foreach(), count()

    // Stream can only terminate once;
    // but it may have multiple intermainate operations

    List<Person> persons =
        Arrays.asList(new Person("Peter", 30), new Person("Mary", 25));

    List<String> names = persons.stream() //
        .map(e -> {
          String word = " words...";
          return e.getName() + word;
        })// Stream<>
        .collect(Collectors.toList());
    // .forEach(e -> System.out.println(e));
    System.out.println(names);


    System.out
        .println(names.stream().filter(e -> e.startsWith("Peter")).count());


    // Stream static method
    Predicate<String> lengthFunc = e -> e.length() == 3;
    long l = Stream.of("abc", "defsd", "ghisd", "abc")//
        .filter(lengthFunc)//
        .distinct()//
        .count();
    // System.out.println(l);

    // Stream<Integer> stream =
    List<Integer> integers = Stream.of(1, 2, 3, 4) //
        // .filter(e -> e == 2)//
        .map(e -> { // map will not change the count
          System.out.println("map = " + e);
          // System.out.println("hihi");
          return 2;
        }).collect(Collectors.toList());
    // .forEach(e -> System.out.println(e)); // terminate operation 先決定map有無用；
    System.out.println(integers);
    // System.out.println("count = " + stream.count());
    // System.out.println(l2);


    int setSize = Stream.of(1, 2, 3, 3)//
        .collect(Collectors.toSet()).size();
    System.out.println(setSize);
    System.out.println();


    Stream.of(1, 2, 3, 4, 5)//
        .filter(e -> e < 6 && e > 2)//
        .forEach(e -> System.out.print(e + " ")); // 345

    System.out.println("");


    List<String> animal = Arrays.asList("lion", "tiger", "bear");

    Map<String, Integer> animalMap = animal.stream()//
        .collect(Collectors.toMap(str -> str, str -> str.length()));

    for (Map.Entry<String, Integer> entry : animalMap.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    // Stream.iterate
    Stream.iterate(1, n -> n * 2)//
        .limit(10) //
        .forEach(e -> System.out.println(e));


  }



  public static boolean findElderly(List<Person> persons) {
    return persons.stream()//
        .filter(e -> e.isElderly())// Stream
        .findFirst()// Optional
        .isPresent();// boolean
  }



}
