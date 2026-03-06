package STRING.homeWork;

import java.util.Scanner;

public class Task2 {
     static void main() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                sb.append(str.charAt(i));
            }
        }

        System.out.println("Результат без соседних дубликатов: " + sb);
    }
}
