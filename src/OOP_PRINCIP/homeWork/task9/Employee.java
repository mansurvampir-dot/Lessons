package OOP_PRINCIP.homeWork.task9;

class Employee {
    private String name;
    private Salary salary;

    public Employee(String name, double amount) {
        this.name = name;
        this.salary = new Salary(amount);
    }

    public double getSalary() {
        return salary.getAmount();
    }
}
