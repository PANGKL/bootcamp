package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Shape {

  abstract double area();
  // public static <T extends Shape> double area(List<T> shapes) {

  public static double area(List<? extends Shape> shapes) { // list 不能操作polymorphism
    BigDecimal total = BigDecimal.ZERO;
    // shapes.add(new Circle()); // compile-time check, type-safety
    for (Shape shape : shapes) {
      total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }


  public static void main(String[] args) {

    Shape shape = new Circle(); // Polymorphism
    Shape shape2 = new Square();
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    // shape = new ArrayList<Circle>();

    // List<Shape> list = new ArrayList<Shape>();
    List<? extends Shape> list = new ArrayList<>();
    list = new ArrayList<Square>();
    list = new ArrayList<Shape>();
    // list = new ArrayList<Object>();
    list = new ArrayList<Circle>();
    list.add(new Circle()); // compile check refer declaration
    // compiler要清除含糊的狀況


    List<Map<String, String>> list2 = new ArrayList<>();
    list2.add(new HashMap<>());



  }

}
