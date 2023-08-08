import java.security.PublicKey;

public enum Direction { // special keyword since Java 1.5
  // 1. public class Direction extends Enum
  // 2. enum is final class



  // 全局唯一, 4 objects
  // new Direction("EAST")
  EAST('E', 90, "東"), //
  SOUTH('S', 180, "南"), //
  WEST('W', 270, "西"), //
  NORTH('N', 360, "北") //

  ;



  private char direction;
  private int degree;
  private String chinese;

  private Direction(char direction, int degree, String chinese) {
    this.direction = direction;
    this.degree = degree;
    this.chinese = chinese;
  }


  public String getChinese() {
    return chinese;
  }

  public char getDirection() {
    return this.direction;
  }

  public int getDegree() {
    return this.degree;
  }

  public boolean isOppsite(Direction direction) {
    return Math.abs(this.degree - direction.getDegree()) == 180;
  }



  public static void main(String[] args) {
    System.out.println(Direction.EAST.isOppsite(Direction.WEST));
    System.out.println(Direction.NORTH.isOppsite(Direction.SOUTH));
    System.out.println(Direction.EAST.isOppsite(Direction.SOUTH));
    System.out.println(Direction.EAST.isOppsite(Direction.EAST));



  }



}
