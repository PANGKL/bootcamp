package phone;
public class Phone<A, B, C> extends Machine{

  A branding;
  B model;
  C price;

  public Phone() {
  }

  public Phone(A branding, B model, C price) {
    this.branding = branding;
    this.model = model;
    this.price = price;
  }

  public static <A, B, C> Phone<A, B, C> of(A branding, B model, C price) {
    return new Phone<A, B, C>(branding, model, price);
  }





  public static void main(String[] args) {
    Phone<String, String, Integer> p1 =
        new Phone<String, String, Integer>("Samsung", "A10", 4444);

    Phone.of("LG", "ABC", 323);



  }


}
