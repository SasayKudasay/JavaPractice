package Task4.Task4_1.Notifiers;

import Task4.Task4_1.Observer;
import Task4.Task4_1.SystemAlert;

public class SysLogNotifier implements Observer {
    private String _journalName;

    public SysLogNotifier(String _journalName) {
        this._journalName = _journalName;
    }

    @Override
    public void myNotify(SystemAlert alert) {
        System.out.println(_journalName + " повідомлення було додано для журналу" + " повідомлення: " + alert);
    }
}
