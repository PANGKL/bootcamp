// Generic

import javax.swing.text.StyledEditorKit.BoldAction;

public class Printer<T> {
  // 1. Class Signature, add <>, T represent any type Class;
  // 描述階段
  T value;
  // U number;
  // V Student;
  Object object;



  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public void print() {
    System.out.println(this.value);

  }



  public void setObject(Object object) {
    this.object = object;
  }

  public Object getObject() {
    return this.object;
  }



  public static void main(String[] args) {
    Printer<String> p1 = new Printer<>();
    // Strong type checking -> check if you put a real class into <>
    p1.setValue("abc");
    System.out.println(p1.getValue());

    Printer<Integer> p2 = new Printer<>();
    p2.setValue(123);
    System.out.println(p2.getValue());

    Printer<Double> p3 = new Printer<>();
    p3.setValue(32.0d);
    System.out.println(p3.getValue());
    p3.print();


    //// Dangerous...
    Printer<Boolean> p4 = new Printer<>();
    p4.setObject("String");
    System.out.println(((String) p4.getObject()));
    System.out.println(((String) p4.getObject()).length());



  }



}
