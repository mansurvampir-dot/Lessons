package FOR.HW.task8;

public class fibbanachi {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int i;
        for(i=0;i<15;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;

        }
    }
}
