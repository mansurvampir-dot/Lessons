package METHOD.classWork;

public class Lesson {

    /*
    Аатомия метода:

    модификатор возвращаемыйТип имяМетода(параметры) {
        тело метода
        return значение;  если не void
    }
     */


    public static void main(String[] args) {

//        double width1 = 5, height1 = 3;
//        double area1 = width1 * height1;
//        System.out.println("Площадь 1: " + area1);
//
//        double width2 = 7, height2 = 4;
//        double area2 = width2 * height2;
//        System.out.println("Площадь 2: " + area2);
//
//        double width3 = 2, height3 = 8;
//        double area3 = width3 * height3;
//        System.out.println("Площадь 3: " + area3);


//        printArea(5, 3);
//        printArea(7, 4);
//        printArea(5, 8);


        double result = sum(5, 10);

        System.out.println(div(10, 5));
        System.out.println(div(10, 0));
    }

    public static void printArea(double width, double height) {
        double area = width * height;
        System.out.println("Площадь: " + area);
    }

    public static int div(int a, int b) {
        System.out.println("===============================");
        System.out.println("Начало работы метода");
        if (b == 0) {
            System.out.println("Делить на ноль нельзя");
            return 0;
        }

        System.out.println("Продолжение метода...");

        System.out.println("===============================");
        return a / b;

    }

    static String getStatus(int age, boolean hasLicense, boolean hasInsurance) {
        if (age >= 18) {
            if (hasLicense) {
                if (hasInsurance) {
                    return "Можно водить";
                } else {
                    return "Нужна страховка";
                }
            } else {
                return "Нужны права";
            }
        } else {
            return "Слишком молод";
        }
    }

    static String getStatusClean(int age, boolean hasLicense, boolean hasInsurance) {
        if (age < 18) return "Слишком молод";
        if (!hasLicense) return "Нужны права";
        if (!hasInsurance) return "Нужна страховка";

        return "Можно водить";

    }


//    public static int sum(int a, int b) {
//        return a + b;
//    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(double a, double b, double c) {
        return a + b + c;
    }

    /*
    1) 5 * (4!)
    2) 5 * 4 * 3!
    3) 5 * 4 *3 * 2!
    4) 5 * 4 * 3 * 2 * 1
     */
    public static long fact(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * fact(n - 1);

    }

}
