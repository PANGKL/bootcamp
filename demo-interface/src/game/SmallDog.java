package game;

public class SmallDog extends Dog { // impement合約 also inherited by subclass

  @Override
  public void jump() { // This is contract from class Dog
    super.addScore(5);

  }


  public static void main(String[] args) {
    SmallDog sd1 = new SmallDog();
    sd1.jump();
    System.out.println(sd1.getScore()); // 5
    sd1.up();
    System.out.println(sd1.getScore()); // 7

  }

}
