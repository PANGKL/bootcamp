package Practice;

public class Main {
  public static void main(String[] args) {

    Guitar gtr = new Guitar("Fender", 'L', 2.5, 2000);
    Guitar gtr1 = new Guitar("Fender", 'L', 2.5, 2000);
    Guitar gtr2 = new Guitar("Fender", 'L', 2.5, 2000);


    // Shop item1 = new Shop(new Guitar[] {gtr, gtr1, gtr2});
    // Shop item2 = new Shop("we", 'L', 2.4, 3000);
    Shop item3 = new Shop("we", 'L', 2.4, 3000);



    System.out.println(Shop.getCounter());
    System.err.println(gtr.getID());
    System.err.println(gtr1.getID());
    System.err.println(gtr2.getID());
    System.out.println(gtr.getPrice());


    Triangle tri1 = new Triangle(4.5d, "Black");
    for (int i = 0; i < tri1.getTriagglesEdge().length; i++) {
      System.out.println(tri1.getTriagglesEdge()[i].getColor());
      System.out.println(tri1.getTriagglesEdge()[i].getId());


      Car c1 = new Car("Tesla");
      Car c2 = new Car("BMW");
      Car c3 = new Car("Toyota");
      Car c4 = new Car("Honda");

      Car[] list = new Car[] {c1, c2, c3, c4};

      for (int j = 0; j < list.length; j++) {
        System.out.println("c" + (j + 1) + " is " + list[j].getCarName());

      }


    }

  }
}
