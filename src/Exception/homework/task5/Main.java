package Exception.homework.task5;

public class Main {
    public static void main(String[] args) {
        BankAccount user = new BankAccount();

        try {
            user.deposit(100);
            user.operation(50);
            System.out.println("успешное снятие");

            user.operation(100);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}