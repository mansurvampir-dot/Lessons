package OOP_PRINCIP.homeWork.task5;



class Employee implements Payable {
    private String name;
    private double money;

    public Employee(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double money) {
        this.money = money;
    }

    @Override
    public double getPaymentAmount() {
        return money;
    }

}

