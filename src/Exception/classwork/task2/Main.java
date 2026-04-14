package Exception.classwork.task2;

public class Main {
    public static void main(String[] args){
        double x =15;
        double y =0;
        try {
            Calculator.calculate(10,2,'*');
            Calculator.calculate(10,2,'-');
            Calculator.calculate(10,2,'+');
            Calculator.calculate(10,2,'%');
            Calculator.safeDivide(x,y);
        }catch (ArithmeticException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
