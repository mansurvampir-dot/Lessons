package FOR.HW.task2;

public class umnojenie {
    public static void main(String[] args) {
        int a, b, c;
        for (a = 1; a <= 10; a++) {
            System.out.println("УМНОЖЕНИЕ: "+ a);
            for (b = 1; b <= 10; b++) {
                c = a * b;
                System.out.print(c);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}