package Exception.homework.task9;

class User {

    public static Result<String> findUser(String id) {
        try {
            if (id.equals("1")) {
                return Result.success("Mansur");
            } else {
                throw new Exception("Пользователь не найден");
            }
        } catch (Exception e) {
            return Result.failure(e);
        }
    }

}
