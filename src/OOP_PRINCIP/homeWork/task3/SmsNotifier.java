package OOP_PRINCIP.homeWork.task3;

public class SmsNotifier implements  Notifier{

    private String fon;


    public SmsNotifier(String fon){
        this.fon=fon;
    }


    @Override
    public void send(String message){
        System.out.println("отправка "+ fon + ": "+ message);
    }


}
