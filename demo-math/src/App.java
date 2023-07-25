import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(Math.round(4.5));
        System.out.println(Math.abs(-4.5));
        System.out.println(Math.round(4.5));
        System.out.println(Math.round(4.5));

        System.out.println(Math.sqrt(-25)); // NaN
        System.out.println(Math.sqrt(25)); // 5
        System.out.println(Math.sqrt(26)); // 5.0990195135927845


        int num = -26;
        if (num > 0 && Math.sqrt(num) == 5) { // if num <= 0, exit
            // if not fullfill condition then exit started by left side
            // do something
        }

        Math.random(); // 0.0 - 1.0
        // base10:
        // log10 -> 1
        // log100 -> 3
        // base2:
        // log8 -> 3

        double number = 2.0;
        double naturelog = Math.log(number);

        System.out.println(naturelog);
        System.out.println(Math.log10(1000)); // 3

        int[] nums = new int[] {-100, 100, 90, 50};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.abs(nums[i]);
        }
        System.out.println(sum);

        double[] arr = new double[] {-5.64, 5.23, 9.800, 6.55};
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + (int) Math.round(Math.abs(arr[i])); // += available
        }

        System.out.println(total);

        int cubeLength = 3;
        double volume = Math.pow(cubeLength, 2);
        System.out.println(volume);



        int[] base = new int[] {2, 3, 4, 5};
        int[] index = new int[] {3, 4, 5, 6};
        int[] result = new int[index.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) Math.pow(base[i], index[i]);
        }
        System.out.println(Arrays.toString(result));
        System.out.println(String.valueOf(result));



    }



}
