package Revision;

public class TestException {

  public static int method(int amount) throws BussinessException {
    if (amount >= 0)
      return amount * 100;
    throw new BussinessException("amount < 0");
  }

  public static int method2(int amount) throws ABCException {
    if (amount >= 0)
      return amount * 100;
    throw new ABCException();
  }


  // Apporach 2 thorw Business Exception in method signature
  public static void main(String[] args) throws BussinessException {
    // Exception // checked exception
    // Runtime Exception // unchecked exception
    // Apporach1: handle by try & catch
    try {
      System.out.println(method(100));
    } catch (BussinessException e) {
      System.out.println(e.getMessage());
    }

    // Runtime Exception /unchecked exception
    try {
      int result2 = method2(-3);
      System.out.println(result2);
    } catch (ABCException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("final code Block");
    }

  }

}
