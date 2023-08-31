import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DemoRecord {

  public static void main(String[] args) {
    Person person = new Person("Perter", 5);
    Person person2 = new Person("Perter", 5);

    Person1 person1 = new Person1("John", 30);
    Person1 anothPerson = new Person1("John", 30);


    person.setName("Eric");

    System.out.println(person.getAge());
    System.out.println(person1.age());

    System.out.println(person1.equals(anothPerson)); // true override equal implicity
    System.out.println(person1);
    System.out.println(person.equals(person2)); // false



    // Hash Map check duplicate

    Set<Person1> set = new HashSet<>();
    set.add(person1);
    System.out.println(set.add(person1));
    System.out.println(person1.hashCode() == anothPerson.hashCode());


    


  }

}
