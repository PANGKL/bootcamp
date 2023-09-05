import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.text.html.Option;

public class OptionalDemo {

  public static void main(String[] args) {
    List<String> addresses = new ArrayList<>();
    addresses.add("Hong Kong");
    addresses.add("MainLand");
    addresses.add("Japan");
    Person p1 = new Person("Peter", addresses);

    List<String> addresses2 = new ArrayList<>();
    addresses2.add("Taiwan");
    addresses2.add("US");
    Person p2 = new Person("Ann", addresses2);



    Person p3 = new Person("Peter", addresses2);

    List<Person> persons = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);
    persons.add(p3);

    // System.out.println(getFromdb(persons, "peter"));
    // System.out.println(getFromdb2(persons, "Chan"));

    Optional<Person> result = getFromdb2(persons, "Peter");
    System.out.println(result);

    result.ifPresent(person -> {
      person.getAddress().stream()//
          .forEach(addr -> System.out.println(addr));
    });

    // System.out.println(result.isPresent());


  }

  public static Optional<Person> getFromdb2(List<Person> persons,
      String lastName) {
    return persons.stream()//s
        .filter(p -> p.getName().endsWith(lastName))//
        .findAny(); //
        // .findFirst();
  }



  public static boolean getFromdb(List<Person> persons, String lastName) {

    return persons.stream()//
        .filter(p -> p.getName().endsWith(lastName))//
        .findAny() //
        .isPresent();
  }



}
