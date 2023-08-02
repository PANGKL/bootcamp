public abstract class Person {

  int age;

  Person() {

  }

  public Person(int age) {
    this.age = age;
  }

  

  public abstract void breath();

  public int getAge() {
    return this.age;
  }

}
