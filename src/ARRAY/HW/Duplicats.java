package ARRAY.HW;

import java.util.Arrays;

public class Duplicats {
    static void main(){
        task3();
    }


    public static void task3() {
        int[] dupnumbers = {1, 2, 2, 3, 3, 4, 1, 3, 4, 6};
        Arrays.sort(dupnumbers);
        int[] tempNumbers = new int[dupnumbers.length];
        int res = 0;
        if (dupnumbers.length > 0) {
            tempNumbers[res++] = dupnumbers[0];
        }
        for (int i = 1; i < dupnumbers.length; i++) {
            if (dupnumbers[i] != dupnumbers[i - 1]) {
                tempNumbers[res] = dupnumbers[i];
                res++;
            }
        }
        int[] numbers = Arrays.copyOf(tempNumbers, res);
        System.out.println("Исходный (отсортированный): " + Arrays.toString(dupnumbers));
        System.out.println("Без дубликатов: " + Arrays.toString(numbers));
    }
}