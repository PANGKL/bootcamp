public record Person1(String name, int age) implements TestInterface {

  // Immutable
  // final class (不能被extend修改入面) support 
  // Support Interface, but cannot further (extend Object by default)
  // private final String name;
  // private final int age;
  // All-args constructor only
  // All Getters
  // No Setters (Final instance variable)
  // custom stactic method/ static variable
  // custom constant
  // custom instance methods
  // no other instance variable
  // Already @override equals(), hashCode(), toString()
  static int counter = 0;
  static final int MAX_VALUE = 100;

  public void test(){

  }

  public boolean isElderly(int age) {
    return age >= 65;
  }

  public static int add(int x, int y) {
    return x + y;
  }

}
