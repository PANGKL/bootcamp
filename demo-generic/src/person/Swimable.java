package person;

import java.util.List;

public interface Swimable {

  public void swim();

  // public static <T extends Swimable> void start(List<T> humans) {
  public static void start(List<? extends Swimable> humans) { // wildcard 寫法
    for (Swimable s : humans) {
      s.swim();
    }
  }



}
