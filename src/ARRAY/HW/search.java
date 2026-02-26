package ARRAY.HW;

import java.util.Scanner;

public class search {
    static void main() {
        System.out.println("введите число:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        task1(number);

    }
    public static void task1 (int number) {
        int[] numbers = {10,5,4,6,7,5,4,3,6,23,5,6,10,6,4,};
        int counter = 0;
        for (int num : numbers){
            if (number == num){
                counter += 1;
            }
        }
        System.out.println("нашлось чисел: " + counter);



    }
}
