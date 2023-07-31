package Practice;



public class Triangle {


  private TriangleEdge[] triangleEdges;


  public Triangle(double length, String color) {
    int id = 0;
    triangleEdges = new TriangleEdge[3];
    triangleEdges[0] = new TriangleEdge(++id, length, color);
    triangleEdges[1] = new TriangleEdge(++id, length, color);
    triangleEdges[2] = new TriangleEdge(++id, length, color);
  }

  public TriangleEdge[] getTriagglesEdge() {
    return this.triangleEdges;
  }






}
