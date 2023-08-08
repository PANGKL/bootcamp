package hashset1;

import java.util.HashSet;

public class HashSet2 {
  public static void main(String[] args) {

    HashSet<Byte> bytes = new HashSet<>();
    bytes.add((byte) 4); // int -> byte -> Bytes
    bytes.add(Byte.valueOf((byte) 4)); // int -> byte -> Bytes
    // Java is no necessary to handle return value

    boolean isAdded10 = bytes.add(bytes(10));
    boolean isAdded4 = bytes.add(bytes(4));
    System.out.println(isAdded4); // false


    HashSet<Byte> bytes2 = new HashSet<>();
    bytes2.add(bytes(4));
    bytes2.add(bytes(10));
    System.out.println(!(bytes.equals(bytes2)));
    System.out.println(bytes.equals(bytes2)); // true, Byte equals

    boolean isRemoved10 = bytes.remove(bytes(10)); // 1.remove value 2. return boolean
    System.out.println(isRemoved10);


    bytes.clear();
    bytes2.clear();
    System.out.println(bytes.size());
    System.out.println(bytes2.size());


  }



  public static Byte bytes(int num) {
    return Byte.valueOf((byte) num);
  }



}
