package Order;

public class ItemDesc {

  private String header;
  private String body;

  public ItemDesc(String header, String body) {
    this.header = header;
    this.body = body;
  }


  public static void main(String[] args) {
    ItemDesc itemDesc = new ItemDesc("hi", "hihi");
    ItemDesc itemDesc2 = new ItemDesc("hi", "hihi");

    Transaction t = new Transaction(1, itemDesc, 3, 20);
    Transaction t2 = new Transaction(1, itemDesc2, 3, 20);

    Order order = new Order(new Transaction[] {t, t2});

    System.out.println(order.getTotal());


  }


}
