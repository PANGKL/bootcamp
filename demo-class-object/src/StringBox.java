import java.util.Arrays;

public class StringBox { // class


  private String string; // String -> class


  public StringBox() {} // prevent null constructor, we can delete it

  public StringBox(String string) { //
    if (string == null) // check null
      this.string = ""; // privide empty string
    this.string = string;
  }



  // contructor, getter, setter
  public void settString(String str) {
    this.string = str;
  }

  public StringBox geString() {
    this.string = this.string.concat(this.string);
    return this;
  }


  public StringBox append(String str) {
    if (str == null || "".equals(str)) // must better way to check string eco to str
      return this;
    // if(str!= null && str1.equals(str2))
    this.string = this.string + str;
    return this; // 能夠連環call 同一method
  }

  public String toString() {
    return this.string;
  }


  public static StringBox append(String str1, String str2) {
    return new StringBox(str1 + str2);
  }



  /**
   * 
   * @param idx range
   * @param s
   * @return Object of string box
   */

  public StringBox insert(int idx, String s) {
    if (idx < 0 || idx > s.length()) // null object -> cannot .method
      return this;
    if (s == null || "".equals(s))
      return this;
    this.string = string.substring(0, idx) + s + string.substring(idx); //
    return this;
  }

  public char[] toCharArray() {
    char[] arr = new char[this.string.length()];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = this.string.charAt(i);
    }
    return arr;

  }



  public static void main(String[] args) {
    StringBox s = new StringBox();
    s.settString("hi");
    // System.out.println(s.append("hihi").toString());
    // System.out.println(s.append("javascript").append("wewe").toString());
    System.out.println(s.insert(1, "12345").toString());
    System.out.println(s.geString().geString());

    StringBox s3 = StringBox.append("123", "pkl");
    System.out.println(s3.toString());

    StringBox s2 = new StringBox();
    // s2.insert(3, "java");  //null can not be



    StringBox s4 = new StringBox("matthew");
    System.out.println(Arrays.toString(s4.toCharArray()));

  }

}
