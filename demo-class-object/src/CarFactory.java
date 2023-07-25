public class CarFactory {



  public static void changeColor(Car abc, String color) {
    abc.setColor(color);
  }

  public void changeCapcity(Car car, int capacity) {
    car.setCapacity(capacity);
  }

  public void changeWheel(Car car, int noOfWheel) {
    car.setnoOfWheel(noOfWheel);
  }



  public static boolean isAdult(int abc) {
    return abc >= 18;
  }


  public static void main(String[] args) {
    CarFactory.isAdult(18);
  }



}
