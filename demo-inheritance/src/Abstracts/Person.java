package Abstracts;

public abstract class Person {
  // abstract -> 唔比人 new
  // final -> x extend

  private int age;  //0
  private double height;  //0.00

  public int getAge() {
    return this.age;
  }

  public double getHeight() {
    return this.height;
  }

  // May contain instance method with implementation
  public void run() {
    System.out.println("I am running");
  }

  // May contain abstract method(without implementation)
  public abstract void sleep();


}
