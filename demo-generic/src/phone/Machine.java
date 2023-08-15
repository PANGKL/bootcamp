package phone;

public abstract class Machine {


  String type;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public void getOn() {
    System.out.println("On..");
  }

  public void getOff() {
    System.out.println("Off...");
  }



}
