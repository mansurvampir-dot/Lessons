package Exception.homework.task6;

public class Main {
    public static void main(String[] args) {
        try {
            RetryUtil.retry(new Runnable() {
                public void run() {
                    System.out.println("Попытка...");
                    throw new RuntimeException("Ошибка!");
                }
            }, 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
