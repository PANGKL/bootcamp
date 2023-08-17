package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

  public static void main(String[] args) {

    List<Double> doubles = Arrays.asList(Double.valueOf(12d),
        Double.valueOf(2.3d), Double.valueOf(3.4d));


    System.out.println(doubles.stream()//
        .filter(e -> e > 3) //
        .count());

    System.out.println(doubles.stream().sorted((x, y) -> x < y ? 1 : -1)
        .collect(Collectors.toList()));

  }



}
