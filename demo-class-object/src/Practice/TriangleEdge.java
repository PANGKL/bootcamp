package Practice;

public class TriangleEdge {

  private double length;
  private String color;
  private int id;

  public TriangleEdge(int id, double length, String color) {
    this.color = color;
    this.length = length;
    this.id = id;
  }

  public String getColor() {
    return color;
  }

  public int getId() {
    return id;
  }

  public double getLength() {
    return length;
  }



}
