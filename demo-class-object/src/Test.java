public class Test {

  int weight;
  int tall;

  public void setWeight(int kg) {
    this.weight = kg;
  }

  public 

  public void setTall(int cm) {
    this.tall = cm;
  }

  public void data() {
    System.out.println("this.weight = " + this.weight);
    System.out.println("this.tall = " + this.tall);

  }

  public static void main(String[] args) {
    Test bmx = new Test();
    bmx.setWeight(50);
    bmx.setTall(300);

    bmx.data();

  }

}
