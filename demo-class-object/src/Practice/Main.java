package Practice;

public class Main {
  public static void main(String[] args) {

    Guitar gtr = new Guitar("Fender", 'L', 2.5, 2000);
    Guitar gtr1 = new Guitar("Fender", 'L', 2.5, 2000);
    Guitar gtr2 = new Guitar("Fender", 'L', 2.5, 2000);


    Shop item1 = new Shop(new Guitar[] {gtr, gtr1, gtr2});
    System.out.println(Shop.getCounter());
    System.err.println(gtr.getID());
    System.err.println(gtr1.getID());
    System.err.println(gtr2.getID());



  }

}
