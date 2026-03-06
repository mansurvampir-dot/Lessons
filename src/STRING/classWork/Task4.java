package STRING.classWork;

import java.util.Scanner;

public class Task4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().strip();
        int res = 0;
        String[] strs = str.split("\\s+");
        res = strs.length;
        System.out.println("количество слов: " + res);
    }
}
