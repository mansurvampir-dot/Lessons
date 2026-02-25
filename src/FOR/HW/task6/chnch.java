package FOR.HW.task6;

import java.util.Scanner;

public class chnch {
    public static void main(String[] args) {
        System.out.print("введите число: ");
        Scanner scanner= new Scanner(System.in);
        int x = scanner.nextInt();
        if (x%2==0){
            System.out.println("число четное");
        }else{
            System.out.println("число нечетное");
        }
    }
}
