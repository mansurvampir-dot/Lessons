package STRING.homeWork;

import java.util.Scanner;

public class Task4 {
     static void main() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        String result = compressed.toString();
        if (result.length() < str.length()) {
            System.out.println(result);
        } else {
            System.out.println(str);
        }
    }
}