package Exception.homework.task7;

public class Main {
    public static void main(String[] args) {
        String[] in = {null, "", "123", "absdfc"};
        for (String s : in) {
            try {
                int value = Parser.parseInt(s);
                System.out.println("правильно " + value);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
