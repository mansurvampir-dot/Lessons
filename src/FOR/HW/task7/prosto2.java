package FOR.HW.task7;

import java.util.Scanner;

public class prosto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число: ");
        int x = scanner.nextInt();
        int i;
        for (i=2;i*i<x;i++) {
            if (x % i == 0) {
                System.out.println("число не простое");
                break;
            }
        }
        if(i*i>=x) {
            System.out.println("число простое");
        }
    }
}
