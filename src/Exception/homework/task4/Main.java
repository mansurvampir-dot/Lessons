package Exception.homework.task4;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setAge(25);
            System.out.println("Возраст правильный");

            p.setAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
