public class Demo {

  public static void main(String[] args) {
    // Dynamic Polymorphism (Run-time)
    Building building = new House();
    // House house = new House(213d);



    // Comile-time checks
    // building.getCapacity(); //Compile error
    // building.print(); //Compile error if method store in parent
    building.print(); // Compile confirm u can call print() method
    // Run-time decide which print() is going to call
    // So, " building" variable call House's print() method

    building.print2();


    House house = new House();
    house.print("hello");
    house.print();
    House house2 = new House(3.0d);
    house2.print("hello2");
    house2.print();



    // Static Polymorphism (Compile-time)
    // Method Signature (method name + parameters)

    long l1 = Long.valueOf(1L); // Wrapper class -> unbox
    Long l2 = 3L; // wrapper class -> auto-box
    long l3 = 2; // upcasting
    int i2 = (int) 3L; // downcast



    // downcast (Run-time Polymorphism)
    Object obj = new Container();
    if (obj instanceof Cube) {
      Cube cube = (Cube) obj; // downcast: Object -> Cube
      System.out.println("obj is instance of Cube");
    }

    Object obj2 = new Container();
    if (obj2 instanceof Container) {
      Container cube = (Container) obj2; // downcast: Object -> Cube
      System.out.println("obj2 is instance of Cube");
    }

    Container con1 = new Cube();
    if (con1 instanceof Container) {
      Container cube = (Container) con1; // downcast: Object -> Cube
      System.out.println("con1 is instance of Cube");
    }



    Object obj3 = new Clones();
    // Cube cub2 = (Cube) obj3;
    // runtime exception: Run-time polymorphism

    // Number number = Integer.valueOf(3);
    // Double d1 = (Double) number; // Java.lang.ClassCastException



  }

}
