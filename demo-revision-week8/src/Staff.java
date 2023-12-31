import java.util.Objects;

public class Staff {
  private int id;
  private double salary;
  private String name;

  public Staff(int id, double salary, String name) {
    this.id = id;
    this.salary = salary;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Staff))
      return false;
    Staff staff = (Staff) o;
    return Objects.equals(this.id, staff.id);
  }



}
