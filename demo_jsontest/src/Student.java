package demo_jsontest.src;
import java.util.List;


public class Student {
  private String name;
  private int age;
  private double salary;
  private boolean isMale;
  List<Subjects> subjects;

  public Student(String name, int age, double salary, boolean isMale) {
    this.age = age;
    this.isMale = isMale;
    this.salary = salary;
    this.name = name;
  }

}
