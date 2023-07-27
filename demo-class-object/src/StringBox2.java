import java.util.Arrays;

public class StringBox2 {

  private char[] string; // no overlap with Wrapper class name

  public StringBox2() {

  }

  public StringBox2(char[] arr) {
    // // approach 1
    // this.String = new char[arr.length]; //new object
    // for (int i = 0; i < arr.length; i++) {
    // this.String[i] = arr[i];
    // }

    // approach 2
    this.string = Arrays.copyOf(arr, arr.length); // make copy
  }

  public StringBox2 append(String s) {

    char[] res = new char[this.string.length + s.length()]; // create new array
    int idx = 0; // res idx pin
    int j = 0; // this.string and s length
    while (j < this.string.length) {
      res[idx] = this.string[j];
      idx++;
      j++;
    }
    j = 0;
    while (j < s.length()) {
      res[idx] = s.charAt(j); // s is string
      idx++;
      j++;
    }
    this.string = res;
    return this;

  }



  public void setStrinSg(char[] String) {
    this.string = String;
  }

  public char[] geString() {
    return string;
  }

  public String arrtoString() {
    return Arrays.toString(this.string);
  }

  public String valtoString() {
    return String.valueOf(this.string);
  }



  public static void main(String[] args) {
    char[] chars = new char[] {'a', 'b', 'c'};
    char[] chars2 = new char[] {'x', 'y', 'z'};

    StringBox2 box = new StringBox2(chars);
    System.out.println("01 " + box.toString()); // [a, b, c]

    chars[1] = 'x'; // nomarlly original array will be overwrite (pass by reference)
    // so we should copy the array to new object
    System.out.println("02 " + box.valtoString()); // [a, x, c]
    System.out.println("03 " + Arrays.toString(chars));
    System.out.println("04 " + box.append("ASDPEK").arrtoString()); // append return object is array
    System.out.println("05 " + box.valtoString());

    StringBox2 box2 = new StringBox2(chars2);
    System.out.println("06 " + box2.append("ss").valtoString());



  }


}
