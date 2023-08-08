

public enum Currency {
  USD(1, "US Dollor"), //
  HKD(2, "Hong Kong Dollor"), //
  CNY(3, "Chinese Yuan Renminbi"), //
  GBP(4, "US Dollor")//
  ;

  private String desc;
  private int id;

  private Currency(int id, String desc) {
    this.desc = desc;
    this.id = id;
  }


  public String getDecription() {
    return this.desc;
  }

  public int getId() {
    return id;
  }

  public static Currency getCurrency(int id) {
    for (Currency i : values())
      if (i.id == id)
        return i;
    return null;
  }


  public static void main(String[] args) {
    System.out.println(Currency.valueOf("HKD").getDecription());
    // System.out.println(Currency.valueOf("U").getDecription()); // not found , error

  }


}
