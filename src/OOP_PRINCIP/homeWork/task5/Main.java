package OOP_PRINCIP.homeWork.task5;

public class Main {
    public static void main(String[] args) {
        Payable employee = new Employee("Георгий", 5000.0);
        Payable invoice = new Invoice("1232", 250.75);

        System.out.println("Выплата : " + employee.getPaymentAmount());
        System.out.println("Сумма счёта: " + invoice.getPaymentAmount());
    }
}