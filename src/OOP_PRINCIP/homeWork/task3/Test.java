package OOP_PRINCIP.homeWork.task3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main() {
        Notifier emailmyer = new EmailNotifier("admin");
        Notifier smsmy = new SmsNotifier("896643534");
        Notifier pushmy = new PushNotifier("Iphone");
        List<Notifier> notifiers = new ArrayList<>();
        notifiers.add(emailmyer);
        notifiers.add(smsmy);
        notifiers.add(pushmy);
        Notifier.notifyAllNotifiers(notifiers,"привет");
    }


}
