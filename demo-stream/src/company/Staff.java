package company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Staff {
  String name;
  Department department;
  int performance;

  public Staff(String name, Department department, int performance) {
    this.name = name;
    this.department = department;
    this.performance = performance;
  }

  public Department getDepartment() {
    return department;
  }

  @Override
  public String toString() {
    return "Dept = " + this.department + " name = " + this.name;
  }

  public static void main(String[] args) {
    List<Staff> staffs =
        Arrays.asList(new Staff("Marry", new Department("HR"), 30)//
            , new Staff("Peter", new Department("IT"), 60),
            new Staff("Eric", new Department("IT"), 90));


    // Map<Department, List<Staff>>
    Map<Department, List<Staff>> deptsMap = staffs.stream()//
        // .collect(Collectors.groupingBy(Staff::getDepartment))//
        .collect(Collectors.groupingBy(staff -> staff.department));
    // .forEach(
    // (dept, stafflist) -> System.out.println(dept + " " + stafflist));;
    System.out.println(deptsMap.values());

    for (Staff staff : deptsMap.get(new Department("IT"))) {
      System.out.println(staff.name);
    }



    //
    Map<Boolean, List<Staff>> gradeMap = staffs.stream()//
    .collect(Collectors.partitioningBy(e -> e.performance >= 60));

    gradeMap.entrySet().stream().forEach(e -> System.out.println(e));
    System.out.println(gradeMap);



  }

}
