public class Car {


  // Instance Variables (Instance Var)
  // Member Variables

  private int noOfWheel; // 0
  private int capacity; // 0
  private String color; // null

  public Car() {}


  // All-arguements Constructor (with all attrbute)
  public Car(int noOfWheel, int capacity, String color) {
    this.noOfWheel = noOfWheel;
    this.capacity = capacity;
    this.color = color;
  }
  


  public int getnoOfWheel() {
    return this.noOfWheel;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public String getColor() {
    return this.color;
  }



  public void setnoOfWheel(int noOfWheel) {
    this.noOfWheel = noOfWheel;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public void setColor(String color) {
    this.color = color;
  }



}
