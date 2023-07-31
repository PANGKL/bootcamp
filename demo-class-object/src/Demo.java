import Abstracts.Person;
import Abstracts.Student;

public class Demo {

  public static void main(String[] args) {
    Car car = new Car();
    Person pp = new Person(); // Constructor
    Computer com1 = new Computer();



    Car car2 = new Car(4, 7, "red");
    System.out.println(car2.getCapacity());
    System.out.println(car2.getColor());
    System.out.println(car2.getnoOfWheel());



    car2.setColor("Yello"); // car2 -> object reference(such like domain name), storing the object
    car.setColor("Blue");
    System.out.println(car2.getColor());
    System.out.println(car2); // Car@8bcc55f -> object reference



    String str = new String("Hello"); // str -> object reference, every new object
    // then new object will be created(咬RAM)
    str.charAt(1);
    System.out.println(str); // Hello (Wrapper class )
    // declare -> initialization
    int[] arr = new int[3];
    System.out.println(arr);


    int[] arr1 = new int[] {1, 2, 3};
    Integer sum = 0; // one object one reference
    for (int i = 0; i < arr1.length; i++) {
      sum += arr[i]; // if declare inside for loop, it will be created 3 object reference
    }


    CarFactory carFactory = new CarFactory();
    CarFactory.changeColor(car2, "White"); // Static method
    carFactory.changeCapcity(car2, 100); // non Static method
    carFactory.changeWheel(car2, 4);
    System.out.println(car2.getColor());
    System.out.println(car2.getCapacity());
    System.out.println(car2.getnoOfWheel());


    CarFactory.changeColor(car, "Black");
    carFactory.changeCapcity(car, 123);
    carFactory.changeWheel(car, 2);

    System.out.println(car.getColor());
    System.out.println(car.getCapacity());
    System.out.println(car.getnoOfWheel());


    Student student = new Student("PANG", "MATTHEW", 100);
    System.out.println(student.fullName());
    System.out.println(student.isAdult());

    CarFactory.isAdult(18);



  }



}


