public class Person { // Class 本質 -> template


  // main is use for JVM to indentify location
  // Class just a flie -> Class.java (file)
  // Each class should only one public class
  // attrubuite (形容屬性)
  // describle the person by attributes
  private int age;
  char gender;


  public static boolean isMale(char gender) { // belongs to class
    if (gender == 'F') {
      return false;
    }
    return true;
  }


  public boolean isMale() { // belongs to object
    if (gender == 'F') {
      return false;
    }
    return true;
  }


  ///////////////////////////////// Extra info ////////////////////////////////////
  public boolean isMale1(char gender) { // belongs to object; but can insert outside values
    // public---------------non static
    if (gender == 'F' && this.gender == 'M') {
      return false;
    }
    return true;
  }
  /////////////////////////////////////////////////////////////////////////////


  // getter
  public int getAge() {
    return this.age; // this age;
  }


  // setter
  public void setAge(int age) {
    this.age = age;
  }

  // getter
  public char getGender() {
    return this.gender;
  }

  // setter
  public void setGender(char gender) {
    this.gender = gender;
  }



  // main - >tool to let JVM to execute programm
  // not belongs to Person
  public static void main(String[] args) {
    String s = "abc"; // 本質是new String
    String s2 = new String("abcd"); // new an objec in heap
    String s3 = String.valueOf("abcd"); // new an objec in heap
    Person p = new Person(); // Produce empty person object with default value
    Person p2 = new Person(); // Produce empty person object, with default value
    // p.age = 13; //not good

    Boolean b = new Boolean("true");
    Boolean b2 = Boolean.valueOf("true");
    Boolean b3 = true; // auto-boxing



    p.setAge(13);
    p.setGender('M');
    System.out.println(p.age);
    System.out.println(p.getAge());
    System.out.println(p.getGender());


    // Static vs non-Static
    // static 利用para已可以做到, public for every obj
    // non static,
    System.out.println(isMale('F')); // False

    p.setGender('M'); // insert value
    System.out.println(p.isMale1('F')); //



    Computer computer = new Computer(); // Computer[] -> empty constructor
    computer.setColor("RED");
    computer.setRam(16);
    computer.setWeight(2);



    Computer computer2 = new Computer("Yellow");
    computer2.getColor(); // Yellow
    computer2.setColor("Black");
    computer2.getColor(); // Black

    Computer computer3 = new Computer(16, 2, "Yellow");
    computer3.getColor();
    computer3.getRam();
    computer3.getWeight();



  }



}
