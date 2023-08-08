import java.util.Arrays;
import java.util.Random;

public class Demo {

    private int age;

    public Demo(int age) {
        this.age = age;

    }


    public static void main(String[] args) {
        int[] nums = new int[3];
        // int[] nums -> declaration
        // int[3] : -> initializion
        nums = new int[10]; // re-assignment

        int[][] matrix = new int[3][4]; // new int[row][colum];
        // 3 row x 4 colum
        // 1, 2, 3, 4
        // 5, 6, 7, 8
        // 9, 3, 4, 6

        System.out.println(matrix.length);
        System.err.println(matrix[0].length);


        // random a number and assign to an 2D array;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = new Random().nextInt(13);
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(matrix));



        int[] arr = new int[matrix.length * matrix[0].length];
        int idx = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[idx++] = matrix[i][j];
            }
        }
        System.out.println(Arrays.toString(arr));


        String str = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                str += matrix[i][j] + " ";
            }
        }
        System.out.println(str);

        // 3D array
        int[][][] arr3d = new int[1][2][3];
        // 4D array
        int[][][][] arr4d = new int[1][2][3][4];

        Demo[][] demo = new Demo[2][2];
        demo[0][0] = new Demo(2);
        demo[0][1] = new Demo(3);
        demo[1][0] = new Demo(4);
        demo[1][1] = new Demo(5);


        for (int i = 0; i < demo.length; i++) {
            for (int j = 0; j < demo[0].length; j++) {
                System.out.println("Age = " + demo[i][j].age); // demo[i][j]為new左既object Demo()
            }
        }

        





        String[][] strings = new String[][] {{"abc", "def"}, {"xyz", "ijk"}};
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[0].length; j++) {
                System.out.print(strings[i][j] + " ");
            }
        }



    }
}
