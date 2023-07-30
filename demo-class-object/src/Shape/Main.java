package Shape;

public class Main {

  public static void main(String[] args) {
    Square sq1 = new Square(5);
    Square sq2 = new Square(10);


    // Square sq3 = new Square()
    Square sq3 = new Square(3);
    sq3.getEdges()[0].setColor("yello");
    // getEdges return array, so we can use getEdges()[2] directly and set color;
    System.out.println(sq3.getEdges()[0].getColor());

    System.out.println(2 * Circle.getPi());

    // getEdges() -> 4 address, getEdges[0]-> address
    System.out.println(sq1.getEdges()[0].getId());
    System.out.println(sq1.getEdges()[1].getId());
    System.out.println(sq1.getEdges()[2].getId());

    sq1.getEdge(2).setLength(0);
    sq1.modify(0, null);


    Square s1 = Square.Of(4.5d);
    Square s2 = Square.Of("hi");



  }

}
