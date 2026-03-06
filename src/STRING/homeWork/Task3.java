package STRING.homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase().strip();
        String[] strs = str.split("\\s+");
        char[] st1= strs[0].toCharArray();
        char[] st2= strs[1].toCharArray();
        Arrays.sort(st1);
        Arrays.sort(st2);
        if (st1.length != st2.length) {
            System.out.println("не анаграммы");
        }
        boolean g =true;
        for (int i = 0; i < st1.length; i++) {
                if (st1[i] != st2[i]) {
                    g = false;
                    break;
            }

        }
        if (g==true) System.out.println("анаграммы");
        else System.out.println("нe анаграммы");


    }
}
