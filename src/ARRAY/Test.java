package ARRAY;

import java.util.Arrays;

public class Test {

    public static void main() {
//        base();

        int[][] matrix = {
                {1,2, 3},
                {4}
        };

        int[][] matrix2 = new int[2][];
        matrix2[0] = new int[3];
        matrix2[1] = new int[1];


        int[] grades = {3, 4, 2, 1, 5, 3, 2};
        System.out.println(Arrays.toString(grades));

    }

    private static void base() {
        //              0  1  2  3  4  5  6
        int[] grades = {3, 4, 2, 1, 5, 3, 2};

        String[] names = new String[3]; // [null, null, null]
        names[0] = "Ann";
        names[1] = "Petr";
        names[2] = "Vasay";
//        names[3] = "Unknown";

        int sum = 0;
        for(int grade : grades){
            sum += grade;
        }

        double average = (double) sum/ grades.length;
        System.out.println("Среднее: " + average);


        for (int i = 0; i < names.length; i++) {
            System.out.println("Имя: " + names[i]);
        }
    }
}
