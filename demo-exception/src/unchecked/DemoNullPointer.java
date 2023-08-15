package unchecked;
public class DemoNullPointer {
  public static void main(String[] args) {
    String[] strings = new String[4];

    try {
      for (String str : strings) {
        if (str.charAt(0) == 'a') {
          System.out.println("first charactoer is a");
        }
      }

    } catch (NullPointerException e) {
      System.out.println("NullPointerException");

    }
  }

}
