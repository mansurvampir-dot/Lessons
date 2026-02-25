package FOR.HW2;

public class Task1 {


    public static void main(String[] args) {
        System.out.println(power3(5, 4));
        System.out.println(power2(5,4));
        System.out.println(power1(5,4));


    }

    public static int power1(int base, int exp) {
        int i;
        int result = 1;
        for (i = 1; i <= exp; i++) {
            result *= base;

        }
        return result;

    }

    public static int power2(int base, int exp) {
        if (exp < 1) return 1;
        return base * power2(base, exp - 1);


    }

    public static int power3(int base, int exp) {
        if (exp < 1) return 1;
        if (exp % 2 == 0) {
            int result = 1;
            int i;
            for (i = 1; i <= exp/2; i++) {
                result *= base;}

            return result * result;
        } else {
            return base * power3(base, exp - 1);
        }
    }
}

