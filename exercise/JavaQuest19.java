/**
 * Expected Output: Car Year=2020, Car Model=ModelY
 */
public class JavaQuest19 {
  // Declare instance variables carYear and carModel
  private int year;
  private String model;

  // Constructor with variables carYear and carModel

  public JavaQuest19(int year, String model) {
    this.year = year;
    this.model = model;
  }

  // methods
  public String instance() {
    String output = "Car Year = " + this.year + ", Car Model = " + this.model;
    return output;
  }


  public static void main(String[] args) {
    JavaQuest19 myCar = new JavaQuest19(2020, "ModelY");
    // Create an instance of thefclass, with carYear 2020, and carModel
    // "ModelY"
    // print the expected output
    System.out.println(myCar.instance());



  }
}
