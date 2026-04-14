package Exception.homework.task8;

import static Exception.homework.task8.Validator.*;

public class Main {
    public static void main(String[] args) {
        try {
            validateEmail("Mansur@gmail.com");
            validateAge(152);
            validateNotEmpty("hello");
            System.out.println("Все проверки прошли");
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
