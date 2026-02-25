package IF_ELSE;

import java.util.Scanner;

public class Lesson {


    /**
     * 1)
     * if(условие (true\false)){
     * <p>
     * }
     * <p>
     * 2)
     * if(условие (true\false)){
     * <p>
     * }else{
     * <p>
     * }
     * <p>
     * 3)
     * if(условие (true\false)){
     * <p>
     * }else if(условие){
     * <p>
     * }else{
     * <p>
     * }
     */

    public static void main(String[] args) {
        //    base();


     //   base2();

       // baseIf3();

        mySwitch();

    }

    private static void mySwitch() {
        int day = 1;

       if(day == 3){
            System.out.println("Среда");
        }

        switch (day){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Несуществующий день");

        }


        switch (day){
            case 1-> System.out.println("Понедельник");
            case 2-> System.out.println("Вторник");
            case 3-> System.out.println("Среда");
            case 4-> System.out.println("Четверг");
            case 5-> System.out.println("Пятница");
            case 6,7-> System.out.println("Выходной");
            default -> System.out.println("Несуществующий день");
        }
    }

    private static void baseIf3() {
        int age = 18;
        String status;
        if(age>=18){
            status = "Взрослый";
        }else {

            status = "Ребенок";
        }
        System.out.println(status);

        status = (age>=18) ? "Взрослый" : "Ребенок";
        System.out.println(status);
        System.out.println((age>=18) ? "Взрослый" : "Ребенок");
    }

    private static void base2() {
        // 95+ = 5, 75+ = 4, 50+ 3, все остальное 2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите балл: ");
        int score = scanner.nextInt();

        if (score >= 95) {
            System.out.println("5");
        } else if (score >= 75) {
            System.out.println("4");
        } else if (score >= 50) {
            System.out.println("3");
        } else {
            System.out.println("2");
        }
    }

    private static void base() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите чило: ");
        int number = scanner.nextInt();

        System.out.println("Вы ввели число: " + number);

        if (number > 10) {
            System.out.println("Число больше 10");
        } else if (number == 10) {
            System.out.println("Число равно 10");
        } else {
            System.out.println("Число меньше 10");
        }
    }
}
