

import java.util.function.Function;

public class LenngthFunction implements Function<String, Integer> {
  @Override
  public Integer apply(String str) {
    return str.length();
  }
}
