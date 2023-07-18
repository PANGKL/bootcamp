public class Method {

  public static void print() { // method nema: method
    System.out.println("hello in print method");

  }

  public static int sum(int a, int b) { // like factory, produce only one type
    // left int = return type
    // the int inside the bracket are parameters

    int c = a + b;
    return c; // let result return out

  }

  public static String str(String a, String b) {
    String c = a + " " + b;
    return c;

  }

  public static void main(String[] args) { // Java world special method

    String str = "Hello";
    str += " world"; // append operation


    // Approach1:
    System.out.println("hello in print method");

    // Approach 2: by method
    print(); // must include () , hello in print method

    // Approach 1:
    int x = 10;
    int y = 100;
    int sum = x + y;

    // Approach 2:
    int z = sum(x, y); // 110
    int i = sum(1000, -30);
    if (i == 970) {
      System.out.println("sum is 970");
    }


    String str1 = str(str, "pkl");
    System.out.println(str1);

    // could not input string if sum class is defined to int
    // 1. method nature, let u contain what u code
    // 2. make u all correct and all wrong
    // 3. readable


    method2("hello");
    System.out.println("cicle area = " + method3());


  }

  public static int substract(int a, int b) {
    return a - b; // excute a - b first, then return the result
  }

  public static void method2(String str) {
    if (str == null || "".equals(str)) { // null is not empty, empty -> ""
      return;
    }
    System.out.println("String =" + str + " " + method3());

  }


  public static double method3() {
    return 3.14159;

  }
}

