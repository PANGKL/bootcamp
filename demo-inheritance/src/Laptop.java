import java.util.Objects;

public class Laptop extends Machine { // inheritance

  // Laptop is subclass(child), Machine is superclass(parent)
  // Inherit Machine attribute( "double weight")
  // Inherit Machine method (start() and stop())

  private Keyboard keyboard;
  private Monitor monitor;

  private int volume;


  public Laptop() {
    super(5.0d);
    // super();
    // 背後地call parent的empty constructor
    // implicitly superclass empty constructor (parent)

  }

  public Laptop(Keyboard keyboard, Monitor monitor) {
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  public Laptop(String buttonType, int noOfButton, double length,
      double width) {
    this.keyboard = new Keyboard(buttonType, noOfButton);
    this.monitor = new Monitor(length, width);
  }

  public Laptop(double weight, Keyboard keyboard, Monitor monitor) {
    // super(weight); // new machine(5)
    // new Machine();
    // this.setWeight(weight);
    super(weight); // super + this.setWeight(weight)
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Laptop))
      return false;
    Laptop lap = (Laptop) o;
    return Objects.equals(lap.keyboard, this.keyboard)
        && Objects.equals(lap.monitor, this.monitor);

  }



  @Override // Method Overriding, Complier double check, tagging the method which built from parent
  public void start() {
    super.start();
    System.out.println("Laptop Start...");
  }

  @Override
  public void stop() {
    System.out.println("Laptop Stop...");
  }

  public void mute() { // belongs to laptop not machine
    this.volume = 0;
  }

  // public static String StaticMethod(String x, String y){
  // return x;
  // }


  public static void main(String[] args) {
    Laptop laptop = new Laptop("abc", 100, 15, 10);

    laptop.setWeight(3.0d);
    System.out.println(laptop.getWeight()); // 3.0
    laptop.start(); // Laptop Start...
    laptop.stop(); // Laptop Stop...


    Machine machine = new Machine();
    machine.setWeight(5.0d);
    System.out.println(machine.getWeight()); // 5.0
    machine.start(); // Machine Start
    machine.stop(); // Machine Stop


    Keyboard key1 = new Keyboard("hi", 123);
    Monitor mon1 = new Monitor(23, 20);
    Laptop lp2 = new Laptop(20, key1, mon1);


    Laptop laptop2 = new Laptop();
    laptop2.setWeight(23);
    System.out.println(laptop2.getWeight());

    Laptop laptop3 = new Laptop();
    System.out.println(laptop3.getWeight());

    System.out.println(Machine.StaticMethod("abc", "123")); // abc123
    System.out.println(Machine.StaticMethod("abc", "123")); // call到但慢 abc123 (not recommended)
    Machine.StaticMethod(null, null);



  }
}
