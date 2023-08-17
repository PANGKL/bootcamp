package unaryBinary;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryDemo {

  public static void main(String[] args) {
    UnaryOperator<String> upperCast = str -> str.toUpperCase();
    System.out.println(upperCast.apply("hello"));



    BinaryOperator<String> concat = (s1, s2) -> s1.concat(s2);
    System.out.println(concat.apply("hello", "World"));

    SuperUniary<String> concat2 = (s1, s2, s3) -> s1.concat(s2).concat(s3);
    System.out.println(concat2.apply("abc", "def", "ghi"));



  }

}
