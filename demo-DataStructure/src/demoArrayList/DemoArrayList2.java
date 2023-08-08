package demoArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList2 {

  public static void main(String[] args) {

    // ArrayList String
    ArrayList<String> str = new ArrayList<>();
    str.add("abc");
    str.add("def");
    str.add("xyz");
    str.add("def");


    System.out.println(str.subList(1, 2)); // def, Ffrom idx 1 to idx 1
    // Remove the first occurence of "def"
    System.out.println(str.remove("def")); // remove by Object
    System.out.println(str); // [abc, xyz, def]
    str.remove(1);
    System.out.println(str); // [abc, def]

    Iterator<String> iterator = str.iterator(); // 另一種Arraylist的形態but more method
    while (iterator.hasNext()) { // loop though all items
      System.out.println(iterator.next());
    }
    for (String s : str) { // for each support Array and ArrayList
      System.out.println(s);
    }

    Object[] objects = str.toArray(); // ArrayList<String> -> Object[]
    // Easy to upcast
    for (Object o : objects) {
      if (o instanceof String) { // down cast checking
        String strr = (String) o;
        System.out.println(strr);
      }
    }



    String[] str2 = new String[] {"1", "2", "3"};

    List<String> s2 = new ArrayList<>();// List is Interface
    s2.add("abc"); // add() method must be reflecting the add() in ArrayList


    List<String> str3 = Arrays.asList(str2);
    // str3.add("ijk"); // run-time error

    // Read & Write;
    List<String> str4 = new ArrayList<>(Arrays.asList(str2));
    str4.add("ijk");
    System.out.println(str4);


    Double[] d = new Double[] {1.0d, 2.3d, 3.0d};
    List<Double> doubles = new ArrayList<>(Arrays.asList(d));
    doubles.add(23.0d);
    doubles.get(0);
    doubles.
    System.out.println(doubles);



  }

}
