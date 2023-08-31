public class Student<T> {
  T data;

  public static void main(String[] args) {
    Student<Long> student = new Student<>();
  }

  public T getData() { // not need provide range
    return data;
  }

  public static <T> T getThings(T name) {  //static need provide range <T>
    return name;

  }



}
