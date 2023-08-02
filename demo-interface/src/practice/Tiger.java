package practice;

public class Tiger extends Animal implements Sleepable, Climbable {

  private int age;
  private String name;
  private char sex;


  public Tiger(String name, int age, char sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }



  @Override
  public void callSex() {
    System.out.println(this.name + " sex is " + sex);
  }

  @Override
  public void climb() {
    System.out.println(this.name + " can climb");
    super.addTimes(1);
  }

  @Override
  public void wake() {
    System.out.println(this.name + " wake now.");
  }

  @Override
  public void sleep() {
    System.out.println("ZXZXZXZXZXZX...");
    super.addTimes(2);

  }



}
