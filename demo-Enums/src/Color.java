import java.util.PrimitiveIterator;

public enum Color {
  // hexCode


  RED("#FF000"), //
  GREEN("0FF000"), //
  BLUE("#0000FF"),//
  ;

  private String hexcode;

  public String getHexCode() {
    return this.hexcode;
  }

  private Color(String hexcode) {
    this.hexcode = hexcode;
  }



}
