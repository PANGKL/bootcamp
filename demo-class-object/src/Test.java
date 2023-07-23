public class Test {


  int a;
  int b;


  public void num1(int num) {
    this.a = num;
  }

  public void num2(int num) {
    this.b = num;
  }


  public String sum() {
    String str = String.valueOf(this.a + this.b);
    return str;
  }

  public static int sum(int a, int b) {
    return a + b;
  }



  public static void main(String[] args) {
    Test p1 = new Test();
    p1.num1(10);
    p1.num2(100);
    System.out.println(p1.sum());
    System.out.println(Test.sum(1, 3));

  }

}
