package Task7.Task7_1;

public class SysLogNotifierWrapper extends AbstractWrapper{
    private String _journalName;

    public SysLogNotifierWrapper(INotificationWrapper _wrapper, String _journalName) {
        super(_wrapper);
        this._journalName = _journalName;
    }

    @Override
    public void myNotify(SystemAlert alert) {
        super.myNotify(alert);
        System.out.println("Log notify: " + _journalName + ": " + alert);
    }
}
