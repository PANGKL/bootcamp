public class Person implements Swimable {

  String name;

  @Override
  public void swim() {
    System.out.println("Person is swim");
  }


  public Person(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person name = " + this.name;
  }


}
