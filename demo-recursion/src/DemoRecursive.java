public class DemoRecursive {

  public static void main(String[] args) {


    System.out.println(sum(10));
    System.out.println(sum2(6));
    print(3);
  }

  // algorithm -> algo
  // Question 1
  public static int sum(int k) {
    if (k < 1)
      return k;
    return k + sum(k - 1);
    // 5
    // 5 + sum(4)
    // 4 + sum(3)
    // 3 + sum(2)
    // 2 + sum(1)
    // 1 + sum(0)
    // 0 < 1 return 0;
  }


  // Question 2
  // 0,1,1,2,3,5,8,13
  public static int sum2(int k) {
    int sum = 0;
    if (k <= 1)
      return k;
    return sum2(k - 1) + sum2(k - 2);
  }

  // Question 3
  // 3 2 1 1 2 3, k = 3;
  // non tail recursion
  public static void print(int k) {
    // base condition
    if (k < 1)
      return;
    System.out.print(k + " ");
    print(k - 1);
    System.out.print(k + " ");

  }



}
