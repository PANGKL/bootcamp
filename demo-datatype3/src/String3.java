public class String3 {
    public static void main(String[] args) {
        // GC heap <- nomarl Object
        // String Literal Pool機制 ->String heap (immutable so create 新object)
        String str = "abc";
        String str2 = "abc";
        System.out.println(str.equals(str2)); // true
        System.out.println(str == str2); // true, address same??
        // == check reference


        // String Literal Pool -> "abc" no new key
        //

        String str3 = "abcd";
        System.out.println();
        System.out.println(str2.equals(str3)); // true , check value
        System.out.println(str2 == str3);// false, address is no same


        str = "abc123";

        String str4 = new String("hello");
        String str5 = new String("hello");
        System.out.println(str4 == str5);
        System.err.println(str4.equals(str5));
        // str4 != str5 -> non String Literal Pool ,
        // seperate and create new object
        // only compare obj reference


        //str2 = "abc"
        str = "abc100"; // because "abc100" is not equal to "abc"
        System.out.println(str == str2); // false

        String temp = str;  // 抄落去




    }
}
