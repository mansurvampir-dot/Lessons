package Exception.homework.task8;

public class Validator {

    public static void validateEmail(String email) throws ValidationException {
        if (email == null || !email.contains("@")) {
            throw new ValidationException("Неправильный email");
        }
    }
    public static void validateAge(int age) throws ValidationException {
        if (age < 0 || age > 150) {
            throw new ValidationException("Неправильный возраст");
        }
    }
    public static void validateNotEmpty(String str) throws ValidationException {
        if (str == null || str.isEmpty()) {
            throw new ValidationException("Строка пустая");
        }
    }
}

