package practice;

public abstract class Animal {

  private double height;
  private double weight;
  private char sex;
  private int times;

  public Animal() {}


  public Animal(double height, double weight, char sex) {
    this.height = height;
    this.weight = weight;
    this.sex = sex;

  }

  public int getTimes() {
    return this.times;
  }

  public void addTimes(int time) {
    this.times += time;
  }



  public abstract void callSex();


  public void wake() {
    System.out.println("Animal wake now.");
  }



  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  public double getSex() {
    return this.sex;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setSex(char sex) {
    this.sex = sex;
  }



}
