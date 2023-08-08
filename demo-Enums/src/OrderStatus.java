public enum OrderStatus {

  ORDERED(0), //
  PAID(1), //
  SHIPPED(2), //
  COMPLETE(3) //
  ;


  private int id;

  private OrderStatus(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }



  public boolean isForward(OrderStatus status) {
    return this.id > status.getId();
  }

  public static void main(String[] args) {
    System.out.println(OrderStatus.SHIPPED.isForward(OrderStatus.PAID));
  }


}

