package checked;

import java.sql.Struct;

public class Student {
  String name;
  long pocketmoney;


  public Student(String name) {
    this.name = name;
  }

  public Student() {

  }


  public void setPocketMoney(long pocketMoney) throws AmountZeroException{ // alert 要fix and handle
    if (pocketMoney <= 0)
      throw new AmountZeroException("pocketMoney <= 0");
    this.pocketmoney = pocketMoney;
  }



  public void setName(String name) throws NameTooLongException { // alert 要fix and handle
    if (name.length() > 10)
      throw new NameTooLongException("Name is too long (>50)");
    this.name = name;
  }

  public String getName() {
    return name;
  }


  // two solutions: throw out and try catch
  public static void main(String[] args) {
    Student student = new Student("Jhon");
    // student.setName("Peterwee"); //


    try {
      // check exception
      // int i = 10 / 0;
      student.setPocketMoney(-3);
      student.setName("wewewdwefffff"); // if exception, throw it to the caller
    } catch (NameTooLongException | AmountZeroException e) {
      System.out.println("Student Setter Issue: Message: " + e.getMessage());
      // } catch (Exception e) {
      // System.out.println(e.getMessage()); // /by zero
    } finally {
      System.out.println("finally");
    }



    // System.out.println(student.name);
    Student student2 = new Student();
    // student2.getName().length(); // null pointer, uncheck exception
  }



}
