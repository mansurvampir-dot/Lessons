package FOR.HW.task4;

import java.util.Scanner;
import java.util.Random;

public class gadai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int f = random.nextInt(100) + 1;

        while (true) {
            System.out.println("введи число (1-100)");
            int g = scanner.nextInt();

            if (g > f) {
                System.out.println("меньше");
            } else if (g < f) {
                System.out.println("больше");
            } else {
                System.out.println("Угадал");
                break;
            }
        }

        scanner.close();
    }
}