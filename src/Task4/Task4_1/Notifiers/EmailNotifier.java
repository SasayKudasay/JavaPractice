package Task4.Task4_1.Notifiers;

import Task4.Task4_1.Observer;
import Task4.Task4_1.SystemAlert;

public class EmailNotifier implements Observer {
    private String _uniqueName;

    public EmailNotifier(String _uniqueName) {
        this._uniqueName = _uniqueName;
    }

    @Override
    public void myNotify(SystemAlert alert) {
        System.out.println(_uniqueName + "повідомлення на пошті" + " повідомлення: " + alert);
    }
}
