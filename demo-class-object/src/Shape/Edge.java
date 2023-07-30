package Shape;

public class Edge {
  private double len;
  private String color;
  private int id;


  public Edge(int id, double len, String color) {
    this.id = id;
    this.len = len;
    this.color = color;
  }

  public int getId() {
    return id;
  }


  public void setLength(double len) {
    this.len = len;
  }


  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  // public void setlen(Double len) {
  // this.len = len;
  // }

}
