import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {


  public static void main(String[] args) {
    // Stream support List, Map, Array.stream()
    List<String> str = new LinkedList<>();
    str.add("abc");
    str.add("defiuyi");
    str.add("fgj4");
    str.stream().filter(e -> e.startsWith("a"))
        .forEach(e -> System.out.println(e));


    // method
    str.stream().map(e -> e.length()) // convert string to int
        .filter(l -> l < 5) //
        .forEach(e -> System.out.println(e)); // 3

  }

  Integer i1  = Integer.valueOf(1);



  public static List<Integer> getAge(List<String> str) {
    return str.stream() //
        .map(e -> e.length()) //
        .filter(e -> e < 5) //
        .collect(Collectors.toList());//
  }




  



}
