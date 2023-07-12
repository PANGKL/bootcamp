public class LogicialOperator {
  public static void main(String[] args) {
    boolean isExpensive = true;
    boolean isWorthToBuy = false;
    boolean result = isExpensive && isWorthToBuy; // false ,兩邊都要true先return true
    // && Operator
    // true, true -> true
    // true, false -> false
    // false, true -> false
    // false, false -> false
    System.out.println(result);


    // || Operator
    // true, true -> true
    // true, false -> true
    // false, true -> true
    // false, false -> false
    boolean result2 = isExpensive || isWorthToBuy;
    System.out.println(result2);

    int a = 5;
    int b = 10;
    int c = 13;
    boolean result3 = a > 6 && b < 12; // false
    // logicial operator , always and first
    boolean result4 = c < 15 || a > 6 && b < 12; // c or (a and b) //true
    boolean result5 = c < 15 || (a > 6 && b < 12); // true
    boolean result6 = a < 6 || b < 9 || c < 9; // true

    // ==, >=, <=, !=
    // ==, asking if a equal b
    boolean result7 = a == b; // false
    boolean result8 = a >= 5; // true
    boolean result9 = c <= 13; // true
    boolean result10 = c != 13; // false

    // !- not
    boolean result11 = c < 13; // false
    boolean result12 = !(c < 13); // true
    // line 40 asking if the event of (c < 13) is false
    System.out.println(result12);

    boolean result13 = !(10 > a) && c >= 13 || b == 10; // (false and true) or true ->true
    System.out.println(result13);

    boolean result14 = !(b == 9) && c != 13;
    System.out.println(result14);


    // Operator Precedence
    int result15 = (1 + 9) * 3; // 30
    int result16 = ++result15 + 1; // 31+1 = 32
    int i = 27;
    int result17 = i++ + 1; //
    System.out.println(result17); // 28
    System.out.println(i); // 28
    boolean result18 = 25 + 2 < result17 + 1; // true , can calculate in assignment

    int x = 5;
    int y = 10;
    int z = x += 3 * y; // right to left : 3 *10 =30 , then 30 +5 = 35
    System.out.println(z);

    x = 5;
    int result19 = (x++ + 2) * x++;
    // (x++ + 2)->7, x become 6
    // 7 * 6 -> 42, x become 7
    System.out.println(result19);

    x = 1;
    int result21 = x++ + x++ + x++;
    // int result22 = ++x;
    System.out.println(result21);
    System.out.println(x);

    // int result20 = (++x + 2) * (x++ + 2); // (36+2) * (36 + 2)
    // System.out.println(result20);
    // System.out.println(x);

  }
}
