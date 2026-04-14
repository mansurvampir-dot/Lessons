package Exception.classwork.task1;

public class Main {
    public static void main(String[] args) {
        try {
            Validator.validatePassword("qwerty");
        }catch (WeakPasswordException ex){
            System.out.println(ex.getMessage());
        }
    }
}
