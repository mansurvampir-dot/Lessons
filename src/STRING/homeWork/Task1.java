package STRING.homeWork;

import java.util.Scanner;

public class Task1 {
    static void main() {
        System.out.println("Введите предложение: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            s= s.substring(0,1).toUpperCase() + s.substring(1);
            sb.append(s+" ");

        }

        System.out.println(sb.toString().strip());


    }
}
