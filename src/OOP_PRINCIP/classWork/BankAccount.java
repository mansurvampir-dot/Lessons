package OOP_PRINCIP.classWork;

public class BankAccount {

    private double balance;


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Поплонение на " + amount + ". Итоговый баланс " + balance);
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снятие на " + amount + ". Итоговый баланс " + balance);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
