package demoArrayList;
public interface Player {

  int calculateScore();


  public static void fillThePocket(Pocket pocket) {
    while (!pocket.isFull()) {
      // Random a ball with a random color
      pocket.add(Ball.random());
    }
  }



}
