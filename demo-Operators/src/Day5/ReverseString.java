package Day5;
public class ReverseString {
  public static void main(String[] args) {
    String str = "Hello";
    // String reverse = " ";
    String reversed = "";

    for (int i = str.length()-1 ; i >= 0; i--) { // reverse rule i = length -1 ; i >= 0 (stop when turn 0)
      reversed += str.charAt(i);
    }
    System.out.println(reversed);















  }

}
