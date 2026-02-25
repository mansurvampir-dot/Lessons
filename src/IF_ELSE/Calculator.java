package IF_ELSE;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("напишите число: ");
            int num1 = scanner.nextInt();
            System.out.println("напишите число: ");
            int num2 = scanner.nextInt();
            System.out.println("введите операцию: ");
            String oper = scanner.next();
            switch (oper) {
                case "+" -> System.out.println(num1 += num2);
                case "-" -> System.out.println(num1 -= num2);
                case "*" -> System.out.println(num1 *= num2);
                case "/" -> {
                    if (num2 == 0) {
                        System.out.println("на ноль делить нельзя ");
                    } else {
                        System.out.println(num1 /= num2);
                    }
                }
                case "%" -> {
                    if (num2 == 0) {
                        System.out.println("на ноль делить нельзя ");
                    } else {
                        System.out.println(num1 %= num2);
                    }
                }
                case "&" -> System.out.println(num1 &= num2);
                case "|" -> System.out.println(num1 |= num2);
                case "^" -> System.out.println(num1 ^= num2);
                case ">>" -> System.out.println(num1 >>= num2);
                case "<<" -> System.out.println(num1 <<= num2);
                case ">>>" -> System.out.println(num1 >>>= num2);
                default -> System.out.println("нет такой операции");

            }
        }
    }
}
