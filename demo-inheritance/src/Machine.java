public class Machine {

  private double weight;



  public Machine() {

  }

  public Machine(double weight) {
    this.weight = weight;
  }


  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }


  public void start() {
    System.out.println("Machine Start...");
  }

  public void stop() {
    System.out.println("Machine Stop...");
  }

  public static final String StaticMethod(String x, String y) {
    return x + y;
  }

  // Factory Pattern
  // Machine (Parent Type) 接得哂所有child class的object
  public static Machine produce(int code) { // TV remote;
    switch (code) {
      case 1:
        return new Machine();

      case 2:
        return new Laptop();
    }
    return new Machine();
  }

  public static void stop(int code) {
    Machine machine = Machine.produce(code); // Machine
    machine.stop(); // different child class will have different implementation
  }


  public static void main(String[] args) {
    Machine machine1 = Machine.produce(1); // Machine
    Machine machine2 = Machine.produce(2); // Laptop
    machine1.stop(); // Machine Stop...
    machine2.stop(); // Laptop Stop...

    int pockeyMoney = 100;

    boolean stopCondition = pockeyMoney < 0;
    int code = 1;
    if (stopCondition) {
      Machine.stop(1);
    }


  }


}
