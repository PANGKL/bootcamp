package game;

import java.util.concurrent.CopyOnWriteArrayList;

public abstract class GameMember implements Move{

  int score;

  public int getScore() {
    return this.score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void addScore(int score) {
    this.score += score;
  }

  public void print(){
    System.out.println("hihi");
  }


  public abstract void up();

  public abstract void down();

  public abstract void left();

  public abstract void right();



  public static void upOnce(GameMember... members) {
    for (GameMember member : members) {
      member.up(); // dog /cat objects
    }
  }

  public static void moveOnce(Move[] members) {
    for (Move member : members) {
      member.jump();
    }
  }



  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    GameMember.upOnce(dog, cat); // All member up once method
    System.out.println(dog.getScore()); // 2
    System.out.println(cat.getScore()); // 1

    Move[] members = new Move[] {dog, cat};
    GameMember.moveOnce(members);
    System.out.println(dog.getScore()); // 5 (2+3)
    System.out.println(cat.getScore()); // 5 (1+4)

    // Interface Move default instance method
    cat.print();
    dog.print();
    System.out.println(Move.concat("abc", "123")); // can contain code block and use method

    Cow cow = new Cow();
    cow.print();


  }
}
