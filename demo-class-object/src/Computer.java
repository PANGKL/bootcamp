public class Computer {
  // attributes
  private int ram;
  private int weight;
  private String color;

  // Contructors
  public Computer() { // create new Computer

  }


  public Computer(String color) { // 1.No return type 2.Contructor name = Class name
    this.color = color;
  }

  public Computer(int ram, int weight, String color) { // 1.No return type 2.Contructor name = Class name
    this.color = color;
    this.weight = weight;
    this.ram = ram;

  }


  public String getColor() {
    return this.color;
  }

  public int getWeight() {
    return this.weight;
  }

  public int getRam() {
    return this.ram;
  }



  public void setRam(int ram) {
    this.ram = ram;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public void setColor(String str) {
    this.color = str;
  }

}
