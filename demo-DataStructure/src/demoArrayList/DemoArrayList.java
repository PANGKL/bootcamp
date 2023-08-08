package demoArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {

  public static void main(String[] args) {

    int[] nums = new int[] {1, 2, 3};
    // fixed-length;
    // for both primitive and class
    Integer[] integers = new Integer[] {1, 3, 2};
    // resize, create new object
    integers = new Integer[] {1, 2, 3, 4, 5};
    // integers[2]= "abc"; //compile-time error


    // ArrayList
    ArrayList<Integer> numbers;
    // Initialization
    numbers = new ArrayList<>();

    ArrayList<Integer> numbers2 = new ArrayList<>(); // empty array
    numbers2.add(1); // len1 array
    numbers2.add(2); // len2 array
    numbers2.add(5); // len3 array
    numbers2.add(4); // len4 array
    numbers2.add(null); // len5 array
    // numbers2.add((Integer) Long.valueOf(3)); // Connot cast Long to Integer

    // variable-length
    System.out.println(numbers2.size());

    // Conversion
    Integer[] arr2 = new Integer[numbers2.size()];
    // Define output array type for toArray() perform conversion
    arr2 = numbers2.toArray(arr2);
    System.out.println(Arrays.toString(arr2)); // [1, 2, 5, 4]

    // ArrayList<int> , not support primitive

    for (int i = 0; i < numbers2.size(); i++) {
      System.out.println(numbers2.get(i)); // Possible to have IndexOutOfBound
    }

    int original = numbers2.set(2, 100); // unbox
    System.out.println("original " + original);

    System.out.println(numbers2.isEmpty());
    System.out.println(numbers2.size() == 0);

    ArrayList<Integer> numbers3 = new ArrayList<>();
    numbers3.add(1000);
    numbers3.add(2000);

    numbers2.addAll(numbers3); // add all items from numbers3 to number2
    System.out.println(numbers2.size()); // 7


    // Remove
    numbers2.remove(2); // remove by index // remove Integer 100
    System.out.println(numbers2.size()); // 6


    numbers2.removeAll(numbers3); // remove Integer 1000,2000
    System.out.println(numbers2.size()); // 4


    System.out.println(numbers2.indexOf(1000)); // -1
    System.out.println(numbers2.indexOf(2)); // 1


    System.out.println(numbers2.contains(4)); // true
    System.out.println(numbers2.contains(900)); // false

    System.out.println(numbers.containsAll(numbers3)); // false

    System.out.println(numbers2.lastIndexOf(null));



    System.out.println(numbers2);

    numbers2.add(1, 4); // insert;
    System.out.println(numbers2); // [1, 4, 2, 4, null]


    numbers2.clear(); // remove all elements
    System.out.println(numbers2.size()); // 0


    /////////////////////////////////////////////////////////////////////////////////////////////

    ArrayList<String> str = new ArrayList<>();
    str.add("abc");
    str.add("def");
    str.add("orif");
    str.add("kefn");

    String[] arr = new String[str.size()];
    arr = str.toArray(arr);
    System.out.println(Arrays.toString(arr));
    // for (int i = 0; i < str.size(); i++) {
    // System.out.println(str.get(i));
    // }
    System.out.println(str.get(1));
    System.out.println(str.indexOf("e")); // -1



  }

}
