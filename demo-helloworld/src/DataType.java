public class DataType {
  //
  public static void main(String[] args){
    //Number, Text
    //Declaration
    // int is a way to declare a variable
    int num; 
    //from now on, we can put integer to variable num.
    num = 3; //from right to left. (assignment)
    System.out.println("3");
    System.out.println(3);
    System.out.println(num);
    
    // text
    // Declaration + assignment (optional)
    String str;
    str = "Hello";
    System.out.println(str);

    //Re-assignment
    num = 10;
    //floating point
    //int num3 = 1.11; //error, only store integer
    double f = 1.03;
    System.out.println(f);

    //byte
    byte b = 124; //must -128 < b < 127
    System.out.println(b);
    // short
    short s = 32000;
    short s2 = -234;
    System.out.println(s);
    //long
    long l = 21324234;
    long l2 = 23349L; // norm -> L
    System.out.println(l);

    float ff = 1.099889348834789f;  // delcare float, ne
    double d4 = 12334.23948d; 
    
    //should be assigned by single qoute
    char gender = 'M';
    char space = ' ';
    char number = 1232;
    //char empty ='' //error

    boolean isMale = true;
    boolean isSalaryGreaterThan1000 = true;
    boolean isValid = false;

    //initialization , mean the first time of assignment;
    int a10 = 0;
    // short a10 = 2 not OK
    // int a10 = 23 only can declare once 
    a10 = 100;  
    System.out.println(a10);
    a10 = 1242; //can be reassign
    System.out.println(a10);

    //String + Operation
    String string1 = "Hello";
    String string2 = " World";
    String result = string1 + string2;
    String result2 = result + 232+ 31;
    System.out.println(result);
    System.out.println(result2);
    System.out.println(result + " " +result2);

    String str2 = "abc" + 'A'; // 默認後面會轉為String
    String str3 = "abc" + 13; //default behavior: convert 13 to String
    String str4 = "abc" + true; // abdtrue
    String str5 = "" + 13 + 13; // -->string "13", result : 1313

    //String str5 = 'A';  
    System.out.println(str4);
    // abc13
    


    int a = 1 + 3; //4
    int bb = 1 - 3; //-2
    int c = 2 - 34;
    int i = 2 * 100; // 200
    int p = 10 / 3; //3
    int qq = 10 % 3; // 1
    System.out.println(qq);


  }
}
