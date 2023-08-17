import java.util.List;

public class Phone1 {
  String name;
  

  public Phone1() {}

  public Phone1(String name) {
    this.name = name;
  }



  public static class Mon {
    int size;
    List<String> str;

    public void setSize(int size) {
      this.size = size;
    }

    public int getSize() {
      return this.size;
    }



  }

  public class Camera {
    String model;

    public void setModel(String model) {
      this.model = model;
    }

    public String getModel() {
      return model;
    }

  }



  public static void main(String[] args) {

    Phone1 p1 = new Phone1("iphone");
    Phone1.Camera c1 = p1.new Camera();
    c1.setModel("hii");


  }

}
