// @FunctionalInterface
// Anootation: check if this interface has one method only
// if no compile error

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public interface Swimable {
  void swim();



  public static void main(String[] args) {

    // Lambda: you have to use "return", if you use{}
    Comparator<Person> sortbynameDesc = (Person p1, Person p2) -> {
      return p2.name.charAt(0) > p1.name.charAt(0) ? 1 : -1;
    };

    // List<Person> persons = Arrays.asList(new Person("ABC"), new Person("DEF"));
    // Collections.sort(persons, sortbynameDesc);
    // System.out.println(persons);

    // new object <- () -> System.out.println("Persn1 is swimming")
    Swimable person = () -> System.out.println("Persn1 is  swimming");
    Swimable person1 = () -> System.out.println("123 hey");
    person1.swim();
    person.swim();

    Swimable person3 = () -> {
      System.out.println("Person2 is start to swim");
    };

    person3.swim();

    Swimable person2 = () -> {
      System.out.println("Person2 is start to swim");
      System.out.println("Person2 is stop swim");
    };
    person2.swim();



  }



}

