package Task7.Task7_1;

public class TelegramNotifierWrapper extends AbstractWrapper {
    private String _userId;

    public TelegramNotifierWrapper(INotificationWrapper _wrapper, String _userId) {
        super(_wrapper);
        this._userId = _userId;
    }

    @Override
    public void myNotify(SystemAlert alert) {

        System.out.println("Telegram notify: "  + _userId + ": " + alert);
        super.myNotify(alert);
    }
}
