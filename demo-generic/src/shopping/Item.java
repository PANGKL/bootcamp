package shopping;

public class Item {
  int price;
  String header;
  String desc;

  public int getPrice() {
    return price;
  }

  public Item() {

  }

  public Item(int price) {
    this.price = price;
  }

  public Item(int price, String header, String desc) {
    this.price = price;
    this.header = header;
    this.desc = desc;
  }



}
