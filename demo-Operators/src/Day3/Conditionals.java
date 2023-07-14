package Day3;
public class Conditionals {
  public static void main(String[] args) {
    // if, else if , else
    int i = 13;
    if (i > 9) { // asking if i > 9 , if yes , excute the follow action
      System.out.println("i = " + i); // 10
    }
    // flow control: if-else
    if (i < 8) {
      System.out.println("i is smaller then 8. ");
    } else {
      System.out.println("i is larger than or equal to 8");
    }

    // else-if
    if (i > 12) {
      System.out.println("i larger than 12"); // no excute
    } else if (i <= 12 && i > 0) {
      System.out.println("i <=12 and > 0"); // excute
    } else {
      System.out.println("i is negative"); // no excute
    }
    // 對位有無影響？

    int a = 2;
    int b = 5;
    int box = 0; // best to declare the variable before event but value is option
    if (a > b) {
      box = 10;
    } else {
      box = 19;
    } // box=19


    int num = 11;
    if (num % 2 == 0) {
      System.out.println("The num is even");
    } else {
      // int remainder = num % 2;
      System.out.println("The num is odd, remainder is " + (num % 2));
    }


    int number = 10;
    if (number % 2 == 1) { // check if number is an odd number
      // do something
      System.out.println("The num is odd number");
    } else {
      System.out.println("The num is even number");
    }


    String str = "Monday"; // check string must need equals
    if (str.equals("Monday")) {
      System.out.println("str = Monday");
    }


    if (str.charAt(4) == 'd') { // check char use ==
      System.out.println("yes");
    } else {
      System.out.println("no");
    }


    if (str.length() > 10) { // false, just 6 letter
      System.out.println("length > 10");
    }



    if (str.equals("Monday") || str.charAt(4) == 'd' || str.length() > 10) {
      System.out.println("what is the result now?");
    }

    int score = 89;
    char grade = ' ';
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    } else if (score >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }
    System.out.println(grade);

    int age = 65;
    Boolean isElderly = age >= 65; // true

    if (isElderly) { // (isElderly) highly readability
      System.out.println("do something");
    }



    // switch
    // Simple Version
    int dayOfWeek = 3;
    String dayName = " ";
    switch (dayOfWeek) { // experssion, but not 主流
      case 1: // value from switch (var)
        dayName = "Monday";
        break; // exit
      case 2:
        dayName = "Tuesday";
        break;
      case 3:
        dayName = "Wedensday";
        break;
      case 4:
        dayName = "Thurday";
        break;
      case 5:
        dayName = "Friday";
        break;
      case 6:
        dayName = "Saturday";
        break;
      case 7:
        dayName = "Sunday";
        break;

    }
    System.out.println(dayName);

    // default
    String sex = "m"; // use String
    String Output = "";
    switch (sex) {
      case "m":
        Output = "male";
        break;
      case "f":
        Output = "female";
        break;
    }
    System.out.println("Sex is " + Output);

    char grade2 = 'C';
    int pocketmoney = 90;
    switch (grade2) {
      case 'A':
        pocketmoney += 100;
        break;
      case 'B':
        pocketmoney += 70;
        break;
      case 'C':
        pocketmoney += 30;
        break;
      default:
        pocketmoney += 10;
    }
    System.out.println("You can get $" + pocketmoney);


  }

}
