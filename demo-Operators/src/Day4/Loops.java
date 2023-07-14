package Day4;

public class Loops {
  public static void main(String[] args) {
    // For loop
    // three stuff,
    // 1. int i = 0,
    // 2.是否滿足
    // 3. ++i （獨立experssion無所謂）
    for (int i = 0; i < 4; ++i) {
      System.out.println("i=" + i + "hello");
      // i = 0 -> 0 <4, 1st Hello
      // i = 1, 2nd Hello
      // i = 2, 3rd Hello
      // i = 3, 4th Hello
    }
    String str = "Hello";
    for (int i = 0; i < str.length(); ++i) {
      char ch = str.charAt(i);
      System.out.println(ch);
    }

    int seat = 1;
    String str1 = "x";
    for (int i = 0; i < 6; ++i) {
      if (i % 2 == 0) {
        System.out
            .println("| " + seat++ + " | " + seat++ + " | " + seat++ + " |");
      } else {
        System.out.println("| " + str1 + " | " + str1 + " | " + str1 + " |");
      }
    }

    int x = 4;
    for (int i = 0; i < 10; ++i) {
      System.out.println(x + " ");
      x *= 2;
    }


    for (int j = 6; j > 0; j--) {
      System.out.println("j = " + j);
    }

    int num = 0;
    for (int k = 0; k < 1; ++k) {
      for (int l = 0; l < 3; l++) {
        System.out.print(num += 1);
        System.out.print(num += 1);
        System.out.println(num += 1);
      }
    }

    int max = 10;
    int count = 0;
    for (int i = 0; i < max; ++i) { // can input some varible
      count += i; // 累積1D野
    }
    System.out.println(count);


    // 將所有單數加起
    // 1. Sum up all and odd numbers
    // 2.Sum up all and odd numbers expect 5.
    int sum = 0;
    int sumOddNumWithout5 = 0;
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 1) {
        sum += i;
      }
      if (i % 2 == 1 && i != 5) {
        sumOddNumWithout5 += i;
      }
    }
    System.out.println(sum);
    System.out.println(sumOddNumWithout5);

    int sum2 = 0;
    for (int i = 0; i < 10; i += 2) {
      sum2 += i + 1;
    }
    System.out.println(sum2);


    for (int i = 0; i < 5; ++i) {
      System.out.println("Hello");
      if (i > 2) { // set some condition make it exit
        break;
      }
    }
    // i = 0
    // hello, i = 0, pass
    // hello, i = 1, pass
    // hello, i = 2, pass
    // hello, i = 3, if statement true,then break

    outerloop: for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        if (i * j == 6) {
          break outerloop;
        }
        System.out.println("i :" + i + ", j : " + j);
      }
    }

    // contine
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.println(i);
    }

    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        if (i != 2 && j != 2) {
          System.out.println("i :" + i + ", j : " + j);
        }
      }
    }


    // for (int i = 0; i < 6; i++) {
    // System.out.print("hello ");
    // if (i > 3) {
    // continue;
    // }
    // System.out.println("bye");
    // }
    // i = 0, hello, bye
    // i = 1, hello, bye
    // i = 2, hello, bye
    // i = 3, hello, bye
    // i = 4, hello,

    for (int i = 0; i < 0; i++) {
      if (i % 2 == 0) {// and 的款式
        if (i % 3 == 0) {
          System.out.println("i =" + i);
        }
      }
    }



    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        System.out.println("xx"); // statement 條件一樣可以用and / or merge埋
      }
      if (i % 3 == 0) {
        System.out.println("xx");
        System.out.println("abc");
      }
    }

    // Nested for loop:

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("hello");
      }
    }

    // System.out.println("*");

    String star = "*";
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 1; j++) {
        System.out.println(star);
        star += star.charAt(0);
      }
    }


    for (int i = 1; i <= 5; i++) {
      String star3 = " ";
      for (int j = 1; j <= 5; j++) {
        if (i >= j) {
          star3 += "*";
        }
        System.out.println(star3);
      }
    }

    int height = 10;
    for (int i = 0; i < height; i++) {
      for (int j = 0; j <= height - i; j++) {
        // (int j = height; j > i; j--)
        System.out.print("@");
      }
      for (int star5 = 0; star5 < i; star5++) {
        // (int star5 = 0; star5 < i * 2 - 1; star5++)
        System.out.print("!");
      }
      System.out.println();
    }

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {   // static 數字 不能dyanamic change
        System.out.print("*");
      }
      System.out.println();
    }



  }
}

