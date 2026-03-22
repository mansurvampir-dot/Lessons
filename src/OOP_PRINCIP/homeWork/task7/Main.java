package OOP_PRINCIP.homeWork.task7;

public class Main {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 5.0;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Сложение: " + Calculator.calculate(new Add(), a, b));
        System.out.println("Вычитание: " + Calculator.calculate(new Substract(), a, b));
        System.out.println("Умножение: " + Calculator.calculate(new Multiply(), a, b));
        System.out.println("Деление: " + Calculator.calculate(new Divide(), a, b));
    }
}
