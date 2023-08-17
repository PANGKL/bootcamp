public class Person {

  String name;
  int age;



  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public boolean isElderly() {
    if (this.age > 60)
      return true;
    return false;

  }



}
