package animal;

public class Zoo<T extends Animal> {
  T animal;

  public Zoo() {

  }

  private Zoo(T animal) {
    this.animal = animal;
  }

  // Zoo<T> -> return Type
  // T -> input para
  // <T> the range of T
  // <T extends Animal> -> the range
  public static <T extends Animal> Zoo<T> of(T animal) {
    return new Zoo<>(animal);
  }

  public static <T extends Bird> Zoo<T> birdOf(T animal) {
    return new Zoo<>(animal);
  }

  public Zoo<T> of() {
    return new Zoo<>(animal);
  }


  public T getAnimal() {
    return animal;
  }

  public void setAnimal(T animal) {
    this.animal = animal;
  }


}
