package phone;

import java.util.ArrayList;

public class Market<T extends Machine> {

  ArrayList<T> item;
  private int quantity;


  public Market() {
    item = new ArrayList<>();
  }

  public void add(T item) {
    this.add(item);

  }

  public static <T extends Machine> Market<T> of() {
    return new Market<>();
  }

  public static void main(String[] args) {
    Phone<String, String, Integer> pp = new Phone<>();
    Market<Phone> p1 = new Market<>();
    p1.add(Phone.of("abc", "sdd", 123));
    p1.add(pp);


  }



}
