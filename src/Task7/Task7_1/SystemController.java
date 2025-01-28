package Task7.Task7_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class SystemController {
    private ArrayList<SystemAlert> _alertHistory;
    private INotificationWrapper _notifier;

    public SystemController(INotificationWrapper _notifier) {
        this._notifier = _notifier;
    }

    public void informAlert(){
        int i = (int) (Math.random() * 100 + 1);
        for (SystemAlert s:
                _alertHistory) {
            s.set_executionCode(i);
            s.set_timestamp(LocalDate.now());
        }

        for (SystemAlert s:
                _alertHistory) {
            for (int a = 0; a < (int)(Math.random() * 3 + 1); a++ ){
                myNotify(s);
                System.out.println();
            }
        }
    }

    public void addAlert(Task4.Task4_1.SystemAlert alert){
        _alertHistory.add(alert);
    }
}
