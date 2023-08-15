import java.util.Comparator;

public class Ball implements Comparable<Ball> {
  int id;
  Color color;

  public Ball(int id, Color color) {
    this.id = id;
    this.color = color;
  }


  // Yellow come first, if color same, id ascending order,
  // If not Yellow, id descending order
  @Override
  public int compareTo(Ball ball) {

    // return ball.id > this.id ? 1 : -1;

    // if (ball.color == Color.YELLOW && this.color == Color.YELLOW) {
    // return ball.id > this.id ? 1 : -1;
    // } else if (ball.color != Color.YELLOW || this.color != Color.YELLOW) {
    // return ball.id > this.id ? 1 : -1;
    // } else {
    // return ball.id < this.id ? 1 : -1;
    // }

    if (this.color == Color.YELLOW && ball.color != Color.YELLOW) {
    // 当前球是黄色球，参数球不是黄色球
    return -1;
    } else if (this.color != Color.YELLOW && ball.color == Color.YELLOW) {
    // 当前球不是黄色球，参数球是黄色球
    return 1;
    } else {
    // 当前球和参数球颜色相同，或者都不是黄色球
    if (this.color == Color.YELLOW && ball.color == Color.YELLOW) {
    // 当前球和参数球都是黄色球
    return Integer.compare(this.id, ball.id);
    } else {
    // 当前球和参数球颜色相同，但都不是黄色球，或者都不是黄色球
    return Integer.compare(ball.id, this.id);
    }
    }



  }



  @Override
  public String toString() {
    return this.color + "," + this.id;
  }



}
