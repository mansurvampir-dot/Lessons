package OOP_PRINCIP.homeWork.task5;

class Invoice implements Payable {
    private String Number;
    private double money;

    public Invoice(String Number, double money) {
        this.Number = Number;
        this.money = money;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    @Override
    public double getPaymentAmount() {
        return money;
    }
}