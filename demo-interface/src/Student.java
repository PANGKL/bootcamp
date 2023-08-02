import game.Dog;
import game.Move;

public class Student extends Person implements Runnable, Swimable, Move { // class signature

  private Strings name;
  private int score;



  @Override
  public void jump() {

  }


  @Override
  public void run() {
    System.out.println("Student is running");
  }

  @Override
  public void swim() {
    System.out.println("Student is swiming ");
  }

  @Override
  public void breath() {
    System.out.println("breath");

  }



  public static void main(Strings[] args) {
    System.out.println(Move.SPEED);
    Move move = new Student();
    move.jump();


    Swimable swimable = new Student();
    swimable.swim();


    // Person person = new Student();
    // person.breath();
    // person.getAge();


    Move dog = new Dog();
    dog.jump();





  }

}
