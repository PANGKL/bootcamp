package practice;

public class Pooh extends Animal implements Climbable, Sleepable {

  private String color;
  private String name;
  private int age;


  public Pooh(String color, String name, int age) {
    this.color = color;
    this.name = name;
    this.age = age;
  }

  public Pooh(double height, double weight, char sex, String color, String name,
      int age) {
    super(height, weight, sex);
    this.color = color;
    this.name = name;
    this.age = age;
  }



  // Contract
  @Override
  public void climb() {
    System.out.println("I can climb");
    super.addTimes(10);
  }

  @Override
  public void sleep() {
    System.out.println("ZXZXZXZXZXZX...");
    super.addTimes(10);

  }


  // Inhritance
  @Override
  public void wake() {
    System.out.println(this.name + " is waking up now");
    super.addTimes(10);
  }


  public void callSex() {
    System.out.println(this.name + " is " + age + " years old");
  }



  public static void main(String[] args) {
    Pooh p1 = new Pooh("Yello", "Winnie", 20);
    Pooh p2 = new Pooh("Red", "PKl", 30);
    Tiger t1 = new Tiger("jumpjump", 45,'M');
    Tiger t2 = new Tiger("HandSome", 15,'F');

    t2.callSex();
    t1.wake();

    p1.callSex();
    // p1.wake();

    Climbable.climbOnce(p1,t1);
    System.out.println("p1 wake time is " + p1.getTimes());
    System.out.println("t1 wake time is " + t1.getTimes());

    Sleepable.sleepOnce(new Sleepable[] {p1,t1});
    System.out.println("p1 sleep time is " + p1.getTimes());
    System.out.println("p2 sleep time is " + t1.getTimes());



  }



}
