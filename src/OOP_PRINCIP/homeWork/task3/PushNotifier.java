package OOP_PRINCIP.homeWork.task3;

public class PushNotifier implements Notifier{
    private String device;
    public PushNotifier(String device){
        this.device=device;
    }
    @Override
    public void send(String message){
        System.out.println("Отправка "+ device + ": "+ message);
    }
}
