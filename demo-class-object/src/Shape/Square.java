package Shape;

import java.util.Arrays;

public class Square {


  private final Edge[] edges; // 鎖死一旦new 左條array, element 會被鎖死
  // private static int length;


  // Encapsulation

  private Square() { // byDefault constructor 1 private左佢，以value of 來起新contructor
    int id = 0;
    edges = new Edge[4]; // [null,null.null.null] define array length
    edges[0] = new Edge(++id, 3, "Red"); // array element
    edges[1] = new Edge(++id, 3, "Yellow");
    edges[2] = new Edge(++id, 3, "Black");
    edges[3] = new Edge(++id, 3, "Blue");
    // Edge.resetID();
  }

  public static Square Of(double length) {
    return new Square(length);
  }

  public static Square Of(String length) {
    return new Square(Double.valueOf(length));
  }

  public static Square Of(float length) {
    return new Square(length);
  }

  public static Square Of(int length) {
    return new Square(length);
  }



  public Edge getEdge(int edgeID) {
    return this.edges[edgeID - 1];
  }



  public Square(double len) {
    if (len <= 0d)
      len = 1.0d;
    edges = new Edge[4];
    edges[0] = new Edge(len, "Red");
    edges[1] = new Edge(len, "Red");
    edges[2] = new Edge(len, "Red");
    edges[3] = new Edge(len, "Red");
  }


  // public void setEdges(Edge[] edges){
  // this.edges = edges; // 上面array已final, 所以不能被修改；
  // }

  public void modifylen(double length) {
    this.getEdges()[0].setLength(length);
    this.getEdges()[1].setLength(length);
    this.getEdges()[2].setLength(length);
    this.getEdges()[3].setLength(length);
  }

  public void modifycolor(String color) {
    this.getEdges()[0].setColor(color);
    this.getEdges()[1].setColor(color);
    this.getEdges()[2].setColor(color);
    this.getEdges()[3].setColor(color);
  }

  public void modify(int edgeID, String color) {
    this.getEdges()[edgeID].setColor(color);
  }



  public Edge[] getEdges() {
    return this.edges;
  }



}
