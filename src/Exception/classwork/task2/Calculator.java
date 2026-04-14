package Exception.classwork.task2;

public class Calculator {
    public static  double calculate(double a,double b,char operation){
        switch (operation){
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return safeDivide(a,b);
            default: throw new
                    IllegalArgumentException("не знаю такой операции");
        }
    }

    public static double safeDivide(double a,double b){
        if(b==0){
            throw new ArithmeticException("делить на ноль нельзя");
        }
        return a/b;
    }

}
