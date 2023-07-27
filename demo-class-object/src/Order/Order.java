package Order;

public class Order {

  private Transaction[] transactions;


  public Order(Transaction[] transactions) {
    this.transactions = transactions;

  }


  // getTotal -> sum up subtotal

  public double getTotal() {
    double total = 0;
    for (int i = 0; i < this.transactions.length; i++) {
      total += this.transactions[i].subtotal();
    }
    return total;
  }

}
