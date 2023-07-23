import java.util.Random;

public class Random1 {
  public static void main(String[] args) {
    int num = new Random().nextInt(3) + 1; // 0,1,2
    System.out.println(num);

    System.out.println(ramdomabcde());
    System.out.println(ramdomabcde1());


  }



  public static char ramdomabcde() {
    // int num = new Random().nextInt(5)+65;
    // char num1 = (char) num;
    // return num1;
    // Apporach2:
    return (char) (new Random().nextInt(5) + 65);


  }

  public static char ramdomabcde1() {
    char[] chars = new char[] {'A', 'B', 'C', 'D', 'E'};
    return chars[new Random().nextInt(5)];
  }
}
