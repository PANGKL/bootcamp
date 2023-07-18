public class Invoice {


  // A method to calculate total prices for an item
  public static double calcToalItemPrice(int quantities, double unitPrices) { // more suit cause formular
    // Early Return
    // Parameters Control
    if (quantities < 0 == unitPrices < 0) {
      return 0;
    }
    return quantities * unitPrices; // main logic
  }

  public static double calcToalInvoiceAmount(double[] itemTotalPrice) { // input double array into method
    double total = 0.0d;
    for (int i = 0; i < itemTotalPrice.length; i++) {
      total += itemTotalPrice[i];
    }
    return total;
  }



  public static void main(String[] args) {


    int[] quantities = new int[] {5, 10, 4, 7, 20};
    double[] unitPrices = new double[] {10.9, 100.3, 2.1, 9.0, 1000.3};


    double[] totalPrice = new double[quantities.length]; // array



    for (int i = 0; i < quantities.length; i++) {
      totalPrice[i] = calcToalItemPrice(quantities[i], unitPrices[i]);
    }
    // System.out.println(totalPrice[0]);


    double invoiceTatalAmount = calcToalInvoiceAmount(totalPrice);



    System.out.println("The Total Amount : " + invoiceTatalAmount);



    // loop

    // }

  }
}
