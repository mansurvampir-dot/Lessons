package ARRAY.HW;

import java.util.Arrays;

public class TwoSortMas {
    static void main() {
        task3();
    }
    public static void task3(){
        int[] numbers1 = {1,2,4,5,7,23,21,5,7,5};
        int[] numbers2 = {4,5,8,4,6,88,24,6,8,6};
        Arrays.sort(numbers1);
        Arrays.sort(numbers2);
        int[] numbers3 = new int[numbers1.length+numbers2.length];
        int i = 0;
        int j = 0;
        for (i =0; i < numbers1.length; i++) {
            numbers3[i] = numbers1[i];
        }
        for (j=0; j < numbers2.length ; j++) {
            numbers3[numbers1.length+j] =numbers2[j];
        }
        Arrays.sort(numbers3);
        System.out.println(Arrays.toString(numbers3));

        }
    }
