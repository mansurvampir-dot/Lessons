package ARRAY.classwork;

public class ClassWork {

    public static void main() {
        task1();
        task2();

    }


    public static void task1(){
        int[] numbers = {2,4,1,5,6,7,8};
        int sum=0;
        for (int number : numbers) {
            sum +=number;


        }
        double average =(double) sum/ numbers.length;

        System.out.println("сумма чисел " + sum);
        System.out.println("среднее арифметичекое" + average);
    }
    public static void task2(){
        int[] numbers = {2,4,6,7,8,5};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]){
                min=numbers[i];
            }

        }
        System.out.println("максимальная" + max);
        System.out.println("минимальная " + min);

        }
    }



