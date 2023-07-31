package Abstracts;

public class Student extends Adult {
  // Must implement abstract method
  public void sleep() {
    System.out.println("I am student");
  }

  public void read() {
    System.out.println("I am student, reading");
  }


  public static void main(String[] args) {
    Student student = new Student();
    student.sleep();
    student.eat();
    student.read();
    student.run();
    student.getAge();

    Person p1 = new Person();
    Adult a1 = new Adult();



  }



}
