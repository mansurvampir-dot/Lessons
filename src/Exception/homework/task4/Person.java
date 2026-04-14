package Exception.homework.task4;

public class Person {
    private int age;
    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Неправильный возраст" + age);
        }
        this.age = age;
    }
}