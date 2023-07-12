public class String1 {
  public static void main(String[] args){
    String str = "I am happy, but raining";
    str = str+ ".";
    System.out.println(str); //I am happy, but raining.

    //Method
   int i = str.length(); //length(), tool to return the length of str
    System.out.println("i = "+ i);
    System.out.println("fwffu".length());
    System.out.println(i+"231".length()+"23");//int + string
    System.out.println(i+"231".length()+100); 
    System.out.println("\""+ str + "\""+ " have "+ i + " letters.");  // How to contain double qoute

    String str1 = "abc";
    String str2 = "abc";
    String str3 = "abcd";
    boolean areTheyEqual = str1.equals(str2); //true
    boolean areTheyEqual2 = str2.equals(str3); //false
    boolean b4 = str3.equals(str1+"d"); // true
    System.out.println(areTheyEqual);
    System.out.println(areTheyEqual2);
    System.out.println(b4);
  

    //chartAt(2), find the char at index 2 of the string
    String str4 = "helloworld";
    System.out.println(str4.charAt(2));// result:l
    System.out.println(str4.charAt(3)); // if 20 未必出error but 中bug





  }
  
}
