package OOP_PRINCIP.homeWork.task3;

import java.util.List;

public interface Notifier {
    void send(String message);

    static void notifyAllNotifiers(List<Notifier> notifiers, String message){
        for(Notifier n : notifiers){
            n.send(message);
        }


    }
}
