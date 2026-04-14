package Exception.homework.task6;

public class RetryUtil {
    public static void retry(Runnable action, int attempts) throws Exception {
        Exception lastException = null;
        for (int i = 0; i < attempts; i++) {
            try {
                action.run();
                return;
            } catch (Exception e) {
                lastException = e;
            }
        }
        throw new Exception("Все попытки провалились", lastException);
    }
}
