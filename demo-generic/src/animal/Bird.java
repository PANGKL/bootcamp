package animal;

public class Bird extends Animal {

  public Bird(String name) {
    super(name);
  }


  public static Bird of(String name) {
    return new Bird(name);
  }


  
}
