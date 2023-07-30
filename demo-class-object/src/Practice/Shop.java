package Practice;

public class Shop {


  public Guitar[] guitars;

  public static int counter;



  public Shop(String brand, char size, double weight, int price) {
   guitars = new Guitar[1];
   guitars[0] = new Guitar(brand, size, weight, price);

  }


  public Guitar[] geGuitars() {
    return guitars;
  }


  public static int getCounter() {
    return ++counter;
  }



  public static void main(String[] args) {

    // Guitar gtr = new Guitar("Fender", 'L', 2.5, 2000);
    // Guitar gtr2 = new Guitar();

    // gtr2.changeBrand(gtr2, "Gibson");
    // gtr2.changePrice(gtr2, 3000);
    // gtr2.changeSize(gtr2, 'L');
    // gtr2.changeWeight(gtr2, 3.0d);



    // System.out.println(gtr2.getBrand());
    // System.out.println(gtr2.getPrice());
    // System.out.println(gtr2.getWeight());
    // System.out.println(gtr2.getSize());

    // System.out.println(gtr.getBrand());
    // System.out.println(gtr.getPrice());
    // System.out.println(gtr.getWeight());
    // System.out.println(gtr.getSize());

  }

}
