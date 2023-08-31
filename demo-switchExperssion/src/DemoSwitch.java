

public class DemoSwitch {
  // static final (constant)(0-2)
  // instance variable (1X)
  // static variable(1-2)
  // constructure
  // public instance method // main logic
  // static methods // tools
  // private methods
  public static void main(String[] args) {
    System.out.println(grade(90));
    Weekday weekday = Weekday.TUE;
    int result = switch (weekday) {
      case MON -> 1;
      case TUE -> 2;
      case WED -> 3;
      case THU -> 4;
      case FRI -> 5;
      case SAT -> 6;
      // default -> 0; no meaining
    };

    int result2 = switch (weekday) {
      case MON, TUE: // condition is not allow in Java 17
        System.out.println("Monday or Tuesday");
        yield 1; // yield means "return" + break
      case WED:
        System.out.println("Wednesday or Tuesday");
        yield 3;
      case THU:
        System.out.println("Thursday or Tuesday");
        yield 4;
      case FRI:
        System.out.println("Friday or Tuesday");
        yield 5;
      case SAT:
        System.out.println("Saturday or Tuesday");
        yield 6;
    };

    System.out.println();



  }

  // public static int getWeekday(Weekday weekday) {
  // int day;
  // switch (weekday) {
  // case MON:
  // return 1;
  // case TUE:
  // return 2;
  // case WED:
  // return 2;
  // case THU:
  // return 2;
  // case FRI:
  // return 2;
  // case SAT:
  // return 2;
  // case SUN:
  // return 2;
  // }
  // }


  public static char grade(int score) {
    char grade = ' ';
    switch (score) {
      case 90:
        grade = 'A';
        break;
      case 80:
        grade = 'B';
        break;
      case 70:
        grade = 'C';
        break;

      default:
        grade = 'F';
        break;
    }
    return grade;


  }

}
