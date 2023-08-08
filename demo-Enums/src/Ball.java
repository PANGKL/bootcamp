import java.net.Socket;

public class Ball {

  private Color color; // Enum becomes attribute of class

  public Ball(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Ball))
      return false;
    Ball ball = (Ball) o;
    return this.color == ball.color;
  }



  public static void main(String[] args) {
    Ball ball = new Ball(Color.RED);
    Ball ball2 = new Ball(Color.BLUE);
    System.out.println(ball.getColor());
    System.out.println(ball.getColor().getHexCode());
    System.out.println(
        "ball vs ball color " + ball.getColor().equals(ball2.getColor()));
    // Object is topmost parent
    Object object = new Ball(Color.RED);
    // Compile-time Class "Object" type check
    object.hashCode();// reference presentation
    // Compile-time check if Object class has hasCode() method
    // Compile-time check if Ball class inherit Object

    // Run-time object variable store an address, point to a Ball object in heap
    // Run-time determine if Class Ball has hashCode() method.
    // If no, then invoke Class Object hashCode()
    // If yes, invoke the Class Ball hashcode()

    Color color = ((Ball) object).getColor();
    // Color extend enum class, enum extend objects
    Class<?> clas = color.getClass();
    System.out.println(clas.getName());
    System.out.println(clas.toString());



    if (object instanceof Ball)
      System.out.println(((Ball) object).getColor()); // Compile time is type checking

    if (Color.BLUE instanceof Color) // true
      System.out.println("Color.BLUE is instance of Color");

    if (Color.BLUE.getClass() == Color.class) // true 小眾化
      System.out.println("Color.BLUE is instance of Color");



    Object o = 1 - 'a';
    System.out.println(o.getClass().getName()); // Integer
    Object o2 = 'b';
    System.out.println(o2.getClass().getName());
    Object o3 = new Ball(Color.GREEN);
    System.out.println(o3.getClass().getName());
    System.out.println(o3.getClass().isEnum()); // false
    System.out.println(clas.isEnum()); // true


    




  }

}
