package Exception.homework.task5;

class BankAccount {
    private double balance;
    private boolean blocked;
    public void deposit(double amount) {
        prof(amount);
        balance += amount;
    }
    public void operation(double amount) {
        prof(amount);
        if (amount > balance) {
            throw new IllegalStateException("Недостаточно средств");
        }
        balance -= amount;
    }
    private void prof(double amount) {
        if (blocked) {
            throw new IllegalStateException("Счёт заблокирован");
        }
        if (amount < 0) {
            throw new IllegalArgumentException("Отрицательная сумма");
        }
    }
}