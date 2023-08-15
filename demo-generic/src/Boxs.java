

import java.util.ArrayList;

public class Boxs<T extends Number> {

  private ArrayList<T> numbers;


  public Boxs() {
    numbers = new ArrayList<>();
  }

  public Boxs(T number) {
    this(); // the empty constructor of Class Box
    numbers.add(number);

  }


  public ArrayList<T> getNumbers() {
    return this.numbers;
  }

  // public void setNumbers(T[] numbers) {
  // this.numbers = numbers;
  // }

  public void add(T number) {
    numbers.add(number);
  }

  public int getSize() {
    return numbers.size();
  }



  public static void main(String[] args) {
    // Box<String> box = new Box<>(); To handle user range of declaration
    Boxs<Integer> box1 = new Boxs<>(100); // compile time check
    box1.add(123);
    System.out.println(box1.getSize());

    // box = new Boxs<>("123") // is not Box<Number>

    








  }


}
