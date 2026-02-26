package ARRAY.HW;

import java.util.Arrays;

public class Shift {
    static void main() {
        task2();
    }
    public static void task2() {
        int[] numbers = {1,2,3,4,5};
        int[] shnumbers = new int[5];
        for (int i = 0; i < numbers.length-1; i++) {
            shnumbers[i] = numbers[i+1];
        }
        shnumbers[shnumbers.length-1]=numbers[0];

        System.out.println(Arrays.toString(shnumbers));

    }
}

