// Outer Class
// Can access static nested class attribute

import java.util.ArrayList;
import java.util.List;

public class Student {
  String name;
  Bag bag;

  public Student() {}

  public Student(String name) {
    this.name = name;
    bag = new Student.Bag();
  }



  // method -> Bag.method, instance variable
  public int getBagSize() {
    return this.bag.getSize();
  }

  // Outer class access "Static nested class" static method
  //
  public void clearBag() {
    Bag.clear(this.bag);
  }

  public static int add(int a, int b) {
    return a + b;
    // add(1+3); compile error
  }

  public String getName() {
    return this.name;
  }

  // public void addBagList(String str) {
  // Bag.add(this.bag, str);
  // }

  // Contructor
  // getter, setter
  // Static method & variable
  // Static nested class

  @Override
  public String toString() {
    return "Student[name = " + this.name //
        + ", Bag[" + this.bag + "]" //
        + "]";
  }



  private static class Bag {
    int size;
    List<String> string;


    public Bag() {
      this.string = new ArrayList<String>();
    }

    // Cannot access Outer Class Attribute
    public int getSize() {
      return this.size;
    }

    public void setSize(int size) {
      this.size = size;
    }

    public static void clear(Bag bag) {
      bag.string.clear();
    }

    // public static void add(Bag bag, String str) {
    // bag.string.add(str);
    // }

    public void printStudentGrade() {
      System.out.println();
    }

    public static void printHello() {
      System.out.println("hello");
    }



    @Override
    public String toString() {
      return "Bag[size = " + this.size//
          + "strings =" + this.string + "]";
    }

  }

  // Inner class(non-static nested class)
  public class Grade {
    private int score;

    public int getScore() {
      return score;
    }

    public char getGrade() {
      switch (this.score) {
        case 90:
          return 'A';
        case 80:
          return 'B';
        case 70:
          return 'C';
        default:
          return 'F';
      }
    }

    public Grade(int score) {
      this.score = score;
    }

    public void setScore(int score) {
      this.score = score;
    }

    public void printStudentName() {
      System.out.println(Student.this.getName());
    }


  }

  public static void main(String[] args) {
    Student student = new Student("john"); // Student's Constructor
    Student.Bag bag = new Student.Bag(); // Bag's Constructor
    bag.string.add("hello");
    System.out.println(bag);

    Student.Grade grade = student.new Grade(79);

    grade.printStudentName();
  }

}
