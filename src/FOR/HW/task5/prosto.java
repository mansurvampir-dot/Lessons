package FOR.HW.task5;

public class prosto {
    public static void main(String[] args) {
        int n;
        int i;
        for (n = 1; n < 100; n++) {
            for (i = 2; i * i <=n; i++) {
                if (n % i == 0) {
                    break;
                }


            }
            if ((i*i)> n){
                System.out.println(n);
            }
        }
    }
}
