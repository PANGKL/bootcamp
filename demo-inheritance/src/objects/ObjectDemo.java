package objects;

import Shape.Circle;
import Shape.Circle10;
import Shape.Shape;

public class ObjectDemo {

  // Rule 1 : All class extend Object implicitly
  // Example 1: ObjectDemo extends Object(can use all method)
  private String name = "hello";

  @Override
  public String toString() {
    return this.name;
  }


  public static void main(String[] args) {
    ObjectDemo objdemo = new ObjectDemo();
    // Hash code -> int
    System.out.println(objdemo.hashCode()); // 1933863327 obj reference
    System.out.println(objdemo); // objects.ObjectDemo@7344699f
    System.out.println(objdemo.toString()); // objects.ObjectDemo@7344699f

    // Because hash code has a short range of value storage
    // so, it cannot store all memory address (object reference) in your machine
    // int[] arr = new int[] {1, 2, 3};
    // System.out.println(arr);
    // char i = '5';
    // char adjusti = Character.valueOf(i);
    // System.out.println(adjusti);



    String str = "abc";
    System.out.println(str);
    System.out.println(str.hashCode()); // 96354
    // a*31^2 + b+31^1 +c
    System.out.println(97 * Math.pow(31, 2) + 98 * 31 + 99); // 96354

    // a == b <- compare by reference


    Integer i1 = 3;
    System.out.println(i1.hashCode()); // 3

    Long l1 = 100L;
    System.out.println(l1.hashCode());// overflow


    // equarls
    String s1 = "abc";
    String s2 = "abc";
    System.out.println(s1.equals(s2)); // true


    // instanceOf, Object.class
    Object obj = new String("abc");
    System.out.println(obj instanceof String); // true
    obj = Long.valueOf(10);
    System.out.println(obj instanceof String); // false
    System.out.println(obj instanceof Long); // true

    // Number
    Integer int1 = Integer.valueOf(100);
    System.out.println(int1 instanceof Number); // 只有親屬關係用 instanceOf 都會成立
    Double d1 = Double.valueOf(100);
    System.out.println(d1 instanceof Number);


    Shape shape = new Circle10(5.0d);
    // shape.print() no print method
    // Hide child pirint() method
    Circle10 c = (Circle10) shape;
    c.print();

    // Wrapper Class equals

    // Wrapper Class, for comparsion, we use equals
    Integer j1 = 128;
    Integer j2 = 128;
    System.out.println(j1.equals(j2)); // true
    j1 = 127;
    j2 = 127;
    System.out.println(j1.equals(j2)); // true
    Boolean bool1 = false;
    Boolean bool2 = false;
    System.out.println(bool1.equals(bool2)); // true
    // var compare var use equals
    // downcase unBoxing
    System.out.println(bool1.equals(false));
    System.out.println(bool1 == false);



  }

}
