public class Strings implements CharSequence {

  private char[] arr;


  public Strings(String str) {
    arr = new char[str.length()];
    // arr = str.toCharArray();
    for (int i = 0; i < str.length(); i++) {
      arr[i] = str.charAt(i); // string.charAt()
    }
  }


  public static Strings valueOf(String str) {
    return new Strings(str);
  }

  @Override
  public char charAt(int idx) {
    return this.arr[idx];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    // return String, StringBuilder,
    if (end < start || start < 0 || end < 0 || start > this.arr.length - 1
        || end > this.arr.length)
      return String.valueOf(this.arr);


    StringBuilder sb = new StringBuilder();
    for (int i = start; i < end; i++) {
      sb.append(arr[i]);
    }
    return sb.toString();

  }

  @Override
  public int length() {
    return arr.length;
  }



  public static void main(String[] args) {
    // CharSequence w
    String str = "abc";
    Strings s = Strings.valueOf("abc");

    System.out.println(s.subSequence(1, 3));
    System.out.println(Strings.valueOf("abc"));



  }



}
