package Exception.homework.task9;

import static Exception.homework.task9.User.findUser;

public class Main {
    public static void main(String[] args) {
        Result<String> result = findUser("1");

        if (result.isSuccess()) {
            System.out.println("Пользователь: " + result.getValue());
        } else {
            System.out.println("Ошибка: " + result.getError().getMessage());
        }
    }
}
