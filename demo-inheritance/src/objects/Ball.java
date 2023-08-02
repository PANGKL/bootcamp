package objects;

import java.util.Objects;

public class Ball {

  private String color;



  public Ball(String color) {
    this.color = color;
  }



  ///////////////// Important ////////////////////////////////////////////
  @Override
  public boolean equals(Object o) {
    // If address same, values inside the object must be same
    if (this == o) // address obj
      return true;
    if (!(o instanceof Ball)) // non ball class 排除 check pass入來的obj是否由Ball class生產出來或inherit
      return false;
    Ball ball = (Ball) o; // change Object class o convert to Ball to get attribute
    return ball.color.equals(this.color); // true of false;
    // 用哂所有attirubute 來比較是否相等
  }

  ///////////////// Important ////////////////////////////////////////////


  @Override
  public String toString() {
    return "[color = " + this.color + "]";
  }



  public static void main(String[] args) {
    Ball b1 = new Ball("Blue");
    Ball b2 = new Ball("Blue");
    System.out.println(b1 == b2); // false
    System.err.println(b1.equals(b2)); // true

    System.out.println(b1); // [color = Blue]
    System.out.println(b1.toString()); // [color = Blue]


  }


}
