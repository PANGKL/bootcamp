public class Number2 {
  int number1;
  int number2;

  // create object method
  public void setNumber1(int number) {
    this.number1 = number;
  }

  // create object method
  public void setNumber2(int number) {
    this.number2 = number;
  }


  public int divide() {
    this.print(); // non-static method call non-static method
    System.out.println(Number2.add(this.number1, this.number2)); // non static object value 咬入 static method para
    return this.number2 / this.number1;
  }


  public int divide1(int number1, int number2) { // non static + para
    return number2 / number1 + this.number1 + this.number2;
  }



  public void print() {
    System.out.println("this.number 1 = " + this.number1);
    System.out.println("this.number 1 = " + this.number2);

  }

  public static int add(int number1, int number2) {
    Number2 a = new Number2();
    a.setNumber1(2);
    a.setNumber2(23);
    a.print();
    return number1 + number2;
  }



  public static void main(String[] args) {
    Number2 n1 = new Number2();
    n1.setNumber1(10);
    n1.setNumber2(100);


    Number2 n2 = new Number2();
    n2.setNumber1(10);
    n2.setNumber2(50);

    System.out.println("n1 = " + n1.divide());
    System.out.println("n1 = " + n2.divide());
    System.out.println(n1.divide1(10, 100));
    n1.print();
    n2.print();


  }

}
