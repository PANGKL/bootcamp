import java.util.ArrayList;
import java.util.function.BiConsumer;
import javax.swing.Box;
import animal.Animal;
import animal.Bird;
import animal.Cat;
import animal.Dog;
import animal.Zoo;

public class DemoGeneric {
  public static void main(String[] args) {
    ArrayList<String> string = new ArrayList<>();



    Zoo<Dog> zoo1 = Zoo.of(Dog.of("xyz"));
    zoo1.setAnimal(new Dog());
    zoo1.setAnimal(Dog.of("abc"));
    // zoo1.setAnimal(new Cat()); Compile error, strong type check


    Zoo<Animal> zoo2 = Zoo.of(new Cat());
    zoo2.setAnimal(new Animal());
    zoo2.setAnimal(Dog.of("abc")); // extends Animal
    zoo2.setAnimal(new Cat()); // extends Animal

    Zoo<Animal> zoo3 = Zoo.of(new Dog());
    zoo3.getAnimal().setName("wewe");
    // Zoo<Bird> zoo4 = Zoo.birdOf(new B);

    Boxs<Integer> box = getBox(Integer.valueOf(100));
    Object object = getBox(Double.valueOf(1.0d));
    Boxs<Double> d1 = (Boxs<Double>) object;
    for (double d : d1.getNumbers()) {
      System.out.println(d);
    }


  }


  public static <T extends Number> Boxs<T> getBox(T element) {
    return new Boxs<T>(element);
  }



  // public static <T extends Number Box<T>getBox(T element) {
  // return new Box<>(element);

  // }

}
