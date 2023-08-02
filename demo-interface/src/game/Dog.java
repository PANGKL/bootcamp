package game;

public class Dog extends GameMember implements Move, Move2 {

  // int score = 0;

  /// Form Move ///
  @Override
  public void jump() {
    super.addScore(3);
  }


  // Form GameMember
  @Override
  public void up() {
    System.out.println("Moving up");
    super.addScore(2);
    // GameMember.up(this);
  }



  @Override
  public void down() {}

  @Override
  public void left() {}

  @Override
  public void right() {}


  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.print(); // print() form GameMember
    // 繼承優先於合約
  }


}
