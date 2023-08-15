package map;

import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class AnimalMap<T> { // Java 17 removed feature "exten String"
  Map<T, String> map;

  public AnimalMap() {
    map = new HashMap<>(); // 空指針會爆

  }

  public AnimalMap(T key, String animal) {
    this();
  }

  public void put(T key, String animal) {
    map.put(key, animal);
  }

  // public Map<> get() {}



  public static void main(String[] args) {

    AnimalMap<String> map1 = new AnimalMap<>();
    map1.put("abc", "Dog");

    AnimalMap<Integer> map2 = new AnimalMap<>();
    map2.put(1, "Dog");
    // System.out.println(map1.);

    AnimalMap<String> map3 = new AnimalMap<String>("abs", "wew");



  }



}
