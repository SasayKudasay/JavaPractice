package Task4.Task4_1.Notifiers;

import Task4.Task4_1.Observer;
import Task4.Task4_1.SystemAlert;

public class TelegramNotifier implements Observer {
    private String _userId;
    private boolean _isInstant;

    public TelegramNotifier(String _userId, boolean _isInstant) {
        this._userId = _userId;
        this._isInstant = _isInstant;
    }

    @Override
    public void myNotify(SystemAlert alert) {
        System.out.println(_userId + " повідомлення на Телеграм було відправлеено. Повідомлення: "
                + alert + "Вдразу відправляти: " + _isInstant );
    }
}
