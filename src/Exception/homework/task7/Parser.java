package Exception.homework.task7;

public class Parser {
    public static int parseInt(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Строка равна null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Строка пустая");
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неверный формат числа: " + str, e);
        }
    }
}