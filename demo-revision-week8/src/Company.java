import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Company {

  List<Staff> staffs;
  List<List<Staff>> staff; //
  private static int counter = 0;

  public Company() {
    staffs = new ArrayList<>();
  }

  public Company(List<Staff> staffs) {
    this.staffs = staffs;
  }

  public void add(Staff staff) {
    this.staffs.add(staff);
    counter++;
  }

  public List<Staff> getStaffs() {
    return staffs;
  }


  public String getStaff(int staffID) {
    return this.staffs.stream()//
        .filter(s -> s.getId() == staffID) //
        .map(s -> s.getName()) // Convert List<Staff> to List<String>
        .findAny() // Optional<String>
        .orElse(null); // String
  }

  public Optional<String> getStaff1(int staffID) {
    return this.staffs.stream()//
        .filter(s -> s.getId() == staffID) //
        .map(s -> s.getName()) // Convert List<Staff> to List<String>
        .findAny()// Optional<String>
        ; 
  }

  public static void main(String[] args) {
    Company company = new Company();
    company.getStaffs().add(new Staff(1, 20000, "John"));
    company.add(new Staff(2, 30000, "Peter"));

    // System.out.println(company.getStaffs().size());
    System.out.println(company.getStaff(1));



  }

}
