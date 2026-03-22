package OOP_PRINCIP.homeWork.task3;

public class EmailNotifier implements Notifier{

    private String email;

    public EmailNotifier(String email){
        this.email=email;
    }

    @Override
    public void send(String message) {
        System.out.println("Отправка " + email + ": " + message);
    }
}
