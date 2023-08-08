package hashmap;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

  public static void main(String[] args) {
    // Background: String[int], Array must use int as index
    // limitation: you can only access the element by int index
    // Solution: HashMap<>,
    HashMap<String, String> map = new HashMap<>();
    // <String, String> -> <key, value>
    map.put("abc", "String");
    map.put("bcd", "I am Developer");
    System.out.println(map.size()); // 2 entries
    // Map.Entry -> Key + Value

    // If Duplicated (equals), override the entry
    map.put("abc", "Hello World!!!"); // Override the entry with key "abc"
    System.out.println(map.get("abc")); // Hello World!!!
    System.out.println(map.size()); // 2 entries
    System.out.println(map.isEmpty()); // false
    System.out.println(map);

    System.out.println(map.containsKey("abc"));
    System.out.println(map.containsValue("I am Developer"));

    if (!map.containsKey("abc"))
      return;


    ///////////////////// Loop //////////////////////////////////////////////////////

    for (Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    for (String key : map.keySet()) {
      System.out.println(key);
    }


    for (String value : map.values()) {
      System.out.println(value);
    }
    
    ///////////////////// Loop //////////////////////////////////////////////////////


    System.out.println(map.remove("abc")); // Hello World!!!
    System.out.println(map.remove("bcd", "I am not develop")); // false
    System.out.println(map.remove("bcd", "I am Developer")); // true
    System.out.println(map.size()); // 0

    ///////////////////// Test //////////////////////////////////////////////////////
    HashMap<Integer, String> dic = new HashMap<>();
    int[] nums = new int[] {1, 2, 3, 4};
    String[] str = new String[] {"apple", "orange", "lemon", "melon"};
    for (int i = 0; i < nums.length; i++) {
      dic.put(nums[i], str[i]);
    }

    System.out.println(dic.get(1));



  }

}
