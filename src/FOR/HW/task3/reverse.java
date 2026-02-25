package FOR.HW.task3;

public class reverse {
    public static void main(String[] args) {
        int x = 12345;
        int g=0;
        while (x > 0){
            int s=x%10;
            g=g*10+s;
            x=x/10;

        }
        System.out.println(g);
    }
}
