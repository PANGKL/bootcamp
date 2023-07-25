import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hello"); // Contructor
        // s -> address/ reference

        s.toString(); // getter"

        s.append(" World");
        System.out.println(s);
        System.out.println(s.toString());
        s.append(1.3f); // default 認到
        System.out.println(s.toString());


        System.out.println(s.append(true).append(4000L).length());
        System.out.println(s);

        String str = " he llo ";
        String[] strs = str.trim().replace('h', 'e').split(" ");
        System.out.println(strs.length);


        System.out.println(Arrays.toString(strs));;


        StringBuilder s2 = new StringBuilder("Start");
        System.out.println(s2.append('a').toString().charAt(2));

        StringBuilder s3 = s2.append('a');
        String s4 = s3.toString();
        s4.charAt(3); // r

        String s10 = "hello"; // how to insert a space between ll;
        StringBuilder s11 = new StringBuilder("hello");
        s11.insert(3, ' ');
        System.out.println(s11);


        s11.insert(0, "world").append("world").toString(); // pass by reference/address
        System.out.println(s11); // worldhel loworld
        System.out.println(s11.deleteCharAt(3).toString()); // wordhel loworld

        System.out.println(s11.append("hi").toString());

        Integer a = 10; // Wrapper class pass by value, still control the copy value.
        System.out.println(a + 10); // a copy
        System.out.println(a); // a still no any change


        s11.setCharAt(4, 'J'); // void: no return , cannot print
        System.out.println(s11.toString());



        String[] arrr = new String[] {"abc", "def"};
        char[] chars = new char[] {'s', 'd'};

        System.out.println(Arrays.toString(arrr));
        System.out.println(Arrays.toString(chars));

        System.out.println(String.valueOf(arrr));
        System.out.println(String.valueOf(chars));

        String str2 = String.valueOf(arrr);
        System.out.println(str2.join(",", arrr));
    

    }

    
}
