package shopping;

import java.util.ArrayList;

public class ShoppingCart {

  private ArrayList<CheckOutItem> items;



  public ShoppingCart() {
    items = new ArrayList<>();
  }

  public int totalAmount() {
    int sum = 0;
    for (CheckOutItem item : this.items) {
      sum += Math.max(0, item.getPrice()) * Math.max(0, item.getQuantity());
      // sum += item.getPrice() * item.getQuantity();
    }
    return sum;
  }



  // 上闊下窄 or 上窄下闊不理想
  public void add(int quantity, DisplayItem displayItem) {
    CheckOutItem checkOutItem =
        new CheckOutItem(quantity, displayItem.getPrice());
    items.add(checkOutItem);
    // construct CheckoutItem
  }


  public boolean remove(CheckOutItem item) {
    return items.remove(item);
  }

  public void clear() {
    this.items.clear();
  }



  public static void main(String[] args) {

    ShoppingCart cart = new ShoppingCart();


    // cart.add(new Rice());
    // // cart.add(new Food()); // Food is abstract
    // ShoppingCart<Drink> cart2 = new ShoppingCart<>();
    // ShoppingCart<Food> cart3 = new ShoppingCart<>();
    // ShoppingCart<Rice> cart4 = new ShoppingCart<>();
    // // ShoppingCart<Object> cart5 = new ShoppingCart<>();



  }



}
