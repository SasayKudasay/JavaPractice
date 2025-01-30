package Task7.Task7_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class SystemController {
    private ArrayList<SystemAlert> _alertHistory = new ArrayList<>();
    private INotificationWrapper _notifier;

    public SystemController(INotificationWrapper _notifier) {
        this._notifier = _notifier;
    }

    public void informAlert(){

        for (SystemAlert s:
                _alertHistory) {
            for (int a = 0; a < (int)(Math.random() * 3 + 1); a++ ){
                _notifier.myNotify(s);
                System.out.println();
            }
        }
    }

    public void addAlert(SystemAlert alert){
        _alertHistory.add(alert);
    }
}
