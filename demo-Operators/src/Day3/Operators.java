package Day3;
import java.util.stream.StreamSupport;

public class Operators {
  public static void main(String[] args) {
    int a = 1;
    a = a + 1;
    a = a - 2;
    int b = 10 / 5;
    b = b * 3 + 5;
    System.out.println("a append b = " + a + b);

    // -1 operation
    int x = 1;
    x = x + 1; // 2
    x++; // 3 means x = x + 1
    ++x; // 4 means x = x + 1
    x += 1;
    System.out.println("x=" + x); // x=4


    // -1 operation
    int y = 10;
    y -= 1;
    y = y - 1;
    y--;
    --y;
    System.out.println(y);

    // other +,-,*-/
    int z = 4;
    z += 2;
    z = z + 2;

    int i = 6;
    i = i - 3;
    i -= 3;

    int w = 3;
    w *= 3;

    int u = 81;
    u = u / 3;
    u /= 3;

    int inter = 12 % 5; // 2
    int inter2 = 12; // 2
    inter2 %= 5; // 2

    // ++,--
    int m = 3;
    m++; // 4
    int preIncrement = ++m; // + first, assignment later
    System.out.println("PreIncrement= " + preIncrement); // 5
    int postIncrement = m++; // assignment first, + later ,
    System.out.println("PostIncrement=" + postIncrement); // 5 ,因先做assignment 而不會做++,所以結果是5
    System.out.println("m=" + m); // 6 ,refer line 54 m value;


    int n = 10;
    n--; // 9
    int pre = --n;
    System.out.println("pre" + pre);  //8
    int post = n--;
    System.out.println("post" + post); //8 
    System.out.println("n = " + n); //7

    //String +=
    String str = "hello";
    str += " world";
    System.out.println(str);

    
    
  }
}
