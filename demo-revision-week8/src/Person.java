import java.util.List;

public class Person {
  private String name;
  private List<String> address;


  public Person(String name) {
    this.name = name;
  }

  public Person(String name, List<String> address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public List<String> getAddress() {
    return address;
  }

  

  @Override
  public String toString() {
    return "Person(name = " + this.name //
        + ", address = " + this.address + " )";
  }

}
