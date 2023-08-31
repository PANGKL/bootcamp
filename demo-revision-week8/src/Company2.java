import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Company2 {

  private Staff[] staffs; // 5


  public Company2() {
    this.staffs = new Staff[0];
  }

  public Company2(Staff[] staffs) {
    this.staffs = staffs;
  }


  public void add(Staff staff) {
    Staff[] original = this.staffs; // reference
    this.staffs = new Staff[this.staffs.length + 1];
    for (int i = 0; i < original.length; i++) {
      this.staffs[i] = original[i];
    }
    this.staffs[this.staffs.length - 1] = staff;
  }


  public void remove(Staff staff) {
    int idx = -1;
    for (int i = 0; i < this.staffs.length; i++) {
      if (staffs[i].equals(staff))
        idx = i;
    }
    if (idx == -1)
      return;

    Staff[] original = this.staffs;
    this.staffs = new Staff[original.length - 1];
    for (int i = 0, j = 0; i < original.length; i++) {
      if (i == idx)
        continue;
      this.staffs[j] = original[i];
      j++;
    }



    // Staff[] original = this.staffs;
    // for (int i = 0; i < original.length; i++) {
    // if (!original[i].equals(staff)) {
    // this.staffs = new Staff[this.staffs.length - 1];
    // original[i] = null;
    // }
    // }

    // for (Staff s : original) {
    // if (s != null) {

    // }

  }



  public static void main(String[] args) {
    Company2 com2 = new Company2();
    com2.add(new Staff(1, 11000, "Peter"));
    System.out.println(com2.staffs.length); // 1
    com2.add(new Staff(2, 22000, "John"));
    System.out.println(com2.staffs.length); // 2



    List<Person> persons = Arrays.stream(com2.staffs)//
        .filter(e -> e.getSalary() > 10000) //
        .map(e -> new Person(e.getName())) //
        .collect(Collectors.toList());

    com2.remove(new Staff(1, 11000, "Peter"));
    System.out.println(com2.staffs.length); // 1



  }
}
