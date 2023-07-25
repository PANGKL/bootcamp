import apple.laf.JRSUIConstants.State;

public class Student {
  // State / Instance Var
  private String firstName;
  private String lastName;
  private int age;



  // All-arguments contructor -> new object (instance)
  public Student(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }


  public String fullName() {
    return this.firstName.concat(" ").concat(this.lastName);
  }

  public boolean isAdult() {
    // Option 1:
    // if (this.age >= 18)
    // return true;
    // return false;

    // option 2;
    // return this.age >= 18 ? true : false;

    // Best choice
    return this.age >= 18;
  }





  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public int getAge() {
    return this.age;

  }



}
