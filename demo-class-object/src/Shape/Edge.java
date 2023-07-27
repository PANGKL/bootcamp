package Shape;

public class Edge {
  private double len;
  private String color;

  public Edge(double len, String color) {
    this.len = len;
    this.color = color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  // public void setlen(Double len) {
  //   this.len = len;
  // }

}
