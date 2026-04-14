package Exception.classwork.task1;

public class Validator {
    public static void validatePassword(String password) throws WeakPasswordException {
        if (password.length()< 8){
            throw new WeakPasswordException("Пароль меньше 8-ми символов");
        }
        boolean hasdigit = false;
        for(char i:password.toCharArray()){
            if(Character.isDigit(i)){
                hasdigit = true;
                break;
            }
        }
        if (!hasdigit){
            throw  new WeakPasswordException("пароль должен содержать хотя бы одно число");
        }
    }
}
