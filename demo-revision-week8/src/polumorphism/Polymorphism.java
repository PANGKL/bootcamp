package polumorphism;

public class Polymorphism {

  public static void main(String[] args) {
    // static polymorphism (overloading)
    // get(int x) is different to get (string x)
    // compile-time check

    // dynamic polymorphism (Parent class, Interface)

    Human customer = new Customer("John");
    customer.order();
    Customer customer2 = new Customer("Peter"); // 1
    customer2.order();
    System.out.println(Customer.counter); // 2 (+1)


    Human human = new Human("PKL");
    human.order();
    System.out.println(Customer.counter); // 4 (+2)
    // Customer human = new Human();
    // Cannot assign Parent class to child class

    customer2.humanOrder();
    System.out.println(Customer.counter); // 6 (+2) humanOrder call super

    // Interface
    Orderable customer3 = new Customer("Eric");
    customer3.order(); // 7 (+1)
    System.out.println(Customer.counter);



    // 可以加implenment過該interface 的obj入去 array
    Orderable[] orders = new Orderable[] //
    {new Driver(), new Customer("Peter")};

    Orderable order = getByName(orders, "Peter");
    // Have one "Peter" obj in orders array, so return customer()
    order.order();
    System.out.println(Customer.counter);
    Orderable order2 = getByName(orders, "Vincent");  // not vincent then return Driver()
    // no vincent obj in orders array, so return Driver()
    order2.order(); // +3 Driver().order() -> counter +3
    System.out.println(Customer.counter);



  }


  // input orders[] list a
  public static Orderable getByName(Orderable[] orders, String name) {
    for (Orderable ord : orders) {
      if (ord instanceof Customer) {
        Customer customer = (Customer) ord;
        if (name.equals(customer.getName()))
          return customer;
      }
    }
    return new Driver();
  }







}
