import java.util.Objects;

public class Monitor {
  double length; // 計算(Method)先用BigDecimal
  double width;

  public Monitor(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Laptop))
      return false;
    Monitor monitor = (Monitor) o;
    return Objects.equals(monitor.length, this.length)
        && Objects.equals(monitor.width, this.width);

  }


  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public void setWidth(double width) {
    this.width = width;
  }

}
