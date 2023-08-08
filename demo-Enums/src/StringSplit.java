public class StringSplit {

  public static void main(String[] args) {
    String s = "abc sbdj due enee";
    for (String str : s.split("\s")) { // \s means space
      System.out.println(str);
    }

    int ss = s.split(" ").length; // return arry then int
    System.out.println(ss);



    System.out.println();
    System.out.println("\\");
    System.err.println((char) '\\');

    String s2 = "  abc      def   ey  eef  ";
    for (String str : s2.trim().split("\\s+")) { // \\s+ 一個或多個
      System.out.println(str);
    }



  }

}
