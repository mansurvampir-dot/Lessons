package IF_ELSE;

import java.util.Scanner;

public class umno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day){
            case(1)-> System.out.println("понедельник");
            case(2)-> System.out.println("вторник");
            case(3)-> System.out.println("среда");
            case(4)-> System.out.println("четверг");
            case(5)-> System.out.println("пятница");
            case(6)-> System.out.println("суббота");
            case(7)-> System.out.println("воскресенье");
            default -> System.out.println("не корректные данные");
        }


    }

    }
