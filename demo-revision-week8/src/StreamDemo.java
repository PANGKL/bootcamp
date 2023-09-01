import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

  public static void main(String[] args) {
    // one table -> many record( where age -> 60)
    // List<

    System.out.println(getFromDb("Lau"));
    System.out.println(getFullName("Chan"));


    // flatMap()
    List<String> addresses = new ArrayList<>();
    addresses.add("Hong Kong");
    addresses.add("MainLand");
    addresses.add("Japan");
    Person p1 = new Person("Peter", addresses);

    List<String> addresses2 = new ArrayList<>();
    addresses2.add("Taiwan");
    addresses2.add("US");
    Person p2 = new Person("Ann", addresses2);

    List<Person> persons = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);

    System.out.println(getAllAddresses(persons));
    System.out.println("getAllAddresses2 = " + getAllAddresses2(persons));
    System.out.println(getAllName(persons));
    System.out.println("getFullName2 = " + getFullName2("Chan"));

    List<String> str = new ArrayList<>();
    str.add("Hello");
    str.add("World");
    // L<String> sdsd =
    List<String> ss = str.stream()//
    .map(s -> s.split(""))//
    .flatMap(s -> Arrays.stream(s))//
    .distinct()//
    .map(s -> s.toString()).collect(Collectors.toList());

    System.out.println(ss);



  }

  public static List<String> getAllName(List<Person> persons) {
    return persons.stream()//
        .map(person -> person.getName()) //
        .collect(Collectors.toList());

  }

  // public static List<String> getAllAddresses1(List<Person> persons) {
  // return persons.stream()//
  // .flatMap(person -> person.getAddress().stream()) //
  // .collect(Collectors.toList());
  // }


  // Count!!!
  public static long getAllAddresses(List<Person> persons) {
    return persons.stream()//
        .flatMap(person -> person.getAddress().stream()) //
        .collect(Collectors.toSet()) //
        .stream()//
        .count();
  }



  public static List<String> getAllAddresses2(List<Person> persons) {
    List<String> address = new ArrayList<>();
    for (Person p : persons) {
      for (String s : p.getAddress()) {
        address.add(s);
      }
    }

    // map
    // List<List<String>> addressLists = new ArrayList<>();
    // for(Person p : persons){
    // addressLists.add(p.getAddress());
    // }

    return address;

  }



  public static List<Person> getFromDb(String lastName) {
    // Call Databas, and returned a list of Person
    // SQL -> filter by lastname(where last_name = lastname)
    List<Person> person = new ArrayList<>();
    person.add(new Person("John Chan"));
    person.add(new Person("Eric Lau"));
    person.add(new Person("Peter Lau"));
    // Stearm, Last name = Lau
    return person.stream() //
        .filter(e -> e.getName().endsWith(lastName))//
        .collect(Collectors.toList());
  }

  public static List<String> getFullName(String lastName) {
    // Call Databas, and returned a list of Person
    // SQL -> filter by lastname(where last_name = lastname)
    List<Person> person = new ArrayList<>();
    person.add(new Person("John Chan"));
    person.add(new Person("Eric Lau"));
    person.add(new Person("Peter Lau"));
    // Stearm, Last name = Lau
    return person.stream() //
        .filter(p -> p.getName().endsWith(lastName))//
        .map(p -> p.getName()) // Convertion: form List<Person> to List<String>
        .collect(Collectors.toList());
  }

  public static List<String> getFullName2(String lastName) {
    List<Person> person = new ArrayList<>();
    person.add(new Person("John Chan"));
    person.add(new Person("Eric Lau"));
    person.add(new Person("Peter Lau"));

    List<String> result = new ArrayList<>();
    for (Person p : person) {
      if (p.getName().endsWith(lastName))
        result.add(p.getName());
    }
    return result;



  }


}
