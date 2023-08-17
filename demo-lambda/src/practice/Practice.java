package practice;

public class Practice {

  public static String printOut(String s1, String s2, MergePrint<String> abc) {
    return abc.print(s1, s2);

  }

  public static void main(String[] args) {
    MergePrint<String> mergePrint = (x, y) -> x + y;

    System.out.println(printOut("Pang ", "Kam Lok", mergePrint));
    // System.out.println(mergePrint.print("hihi", "123"));


  }

}
