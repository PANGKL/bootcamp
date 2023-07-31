
public class Test {
  private String pname;
  private int pcost;
  private int quantity;

  public void setPname(String pname) {
    this.pname = pname;
  }

  public void setPcost(int pcost) {
    this.pcost = pcost;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void detail() {
    System.out.println("The product name is " + this.pname + ". It's cost is "
        + this.pcost + ". Available quantity is " + this.quantity);
  }

  public static void main(String args[]) {
    // creating an object of the Product class
    Test product = new Test();
    // calling methos without using chaining
    product.setPname("AC");
    product.setPcost(20000);
    product.setQuantity(4);
    product.detail();

    
    int a = 10;
    int b = 20;

    int c = a > b ? a : b;
    System.out.println(c);



  }
}
