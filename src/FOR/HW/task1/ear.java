package FOR.HW.task1;

import java.util.Scanner;

public class ear {

    public static void main(String[] args) {
        System.out.println("Введите год");
        Scanner scanner= new Scanner(System.in);
        int god = scanner.nextInt();
        if ((god%4==0 && god%100!=0)|| god%400==0){
            System.out.println("это високосный год");

        }else{
            System.out.println("не високосный год");
        }

    }
}
