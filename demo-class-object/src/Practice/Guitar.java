package Practice;

public class Guitar {
  String brand;
  char size;
  double weight;
  int price;

  public Guitar() {}

  public Guitar(String brand, char size, double weight, int price) {
    this.brand = brand;
    this.size = size;
    this.weight = weight;
    this.price = price;
  }

  public static void changeBrand(Guitar gtr, String brand) {
    gtr.setBrand(brand);
  }

  public static void changeSize(Guitar gtr, char size) {
    gtr.setSize(size);
  }

  public static void changeWeight(Guitar gtr, double weight) {
    gtr.setWeight(weight);
  }

  public static void changePrice(Guitar gtr, int price) {
    gtr.setPrice(price);
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setSize(char size) {
    this.size = size;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  
  public String getBrand() {
    return this.brand;
  }

  public Character getSize() {
    return this.size;
  }

  public Double getWeight() {
    return this.weight;
  }

  public Integer getPrice() {
    return this.price;
  }



}
