package FOR;

public class Lesson {


    public static void main(String[] args) {

       base();

      base2();

        // printf
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i+j + " ");
            }
            System.out.println();
        }

    }

    private static void base2() {
        for (int i = 1; i < 5; i++) {

            if (i == 3){
                continue;
            }
            System.out.println("Нашли " + i);
        }
    }

    private static void base() {
               System.out.println(1);
        System.out.println(2);
       System.out.println(3);
       System.out.println(4);
//        System.out.println(5);

        /* 1

        for (int i = 0 ; i<=5  ; i++ ){

        }

        */


        /*
        1) i = 0
            System.out.println(0);
        2)  i = 1
            System.out.println(1);
        3)  i = 2
            System.out.println(2);
        4)  i = 3
            System.out.println(3);
        5)  i = 4
            System.out.println(4);
        6)  i = 5
            System.out.println(5);
        7) i = 6
            остановка цикла
         */
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("=================================");


        // 2) while
        int count = 0;
        while (count <= 5) {
            System.out.println("Шаг " + count);
            count++;
        }


        System.out.println("=================================");

        int count2 = 0;
        do {
            System.out.println("Шаг " + count2);
            count2++;
        } while (count2 <= 5);
    }
}
