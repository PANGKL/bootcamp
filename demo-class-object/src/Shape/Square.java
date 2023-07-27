package Shape;

import java.util.Arrays;

public class Square {


  private Edge[] edges;


  // Encapsulation

  public Square() { // byDefault constructor 1
    edges = new Edge[4]; // [null,null.null.null] define array length
    edges[0] = new Edge(3, "Red"); // array element
    edges[1] = new Edge(3, "Yellow");
    edges[2] = new Edge(3, "Black");
    edges[3] = new Edge(3, "Blue");
  }


  
  public Square(double len) {
    edges = new Edge[4];
    edges[0] = new Edge(len, "Red");
    edges[1] = new Edge(len, "Red");
    edges[2] = new Edge(len, "Red");
    edges[3] = new Edge(len, "Red");

  }


  public Edge[] getEdges() {
    return this.edges;
  }


  public static void main(String[] args) {
    Square sq1 = new Square(5);
    Square sq2 = new Square(10);


    // Square sq3 = new Square()
    Square sq3 = new Square(3);
    sq3.getEdges()[0].setColor("yello");
    // getEdges return array, so we can use getEdges()[2] directly and set color;
    System.out.println(sq3.getEdges()[0].getColor());

    System.out.println(2 * Circle.getPi());



  }
}
