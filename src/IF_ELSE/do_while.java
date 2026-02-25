package IF_ELSE;

import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int i = 0;
        do {
            d /=10;
            i++;

        } while (d != 0);
        System.out.println(i);
    }
}
