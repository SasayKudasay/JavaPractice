package Task4.Task4_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class SystemController extends Observable{
    private ArrayList<SystemAlert> _alertHistory = new ArrayList<>();

    public SystemController() {
    }

    public void informAlert(){
        int i = (int) (Math.random() * 100 + 1);
        for (SystemAlert s:
             _alertHistory) {
            s.setExecutionCode(i);
            s.setTimestamp(LocalDate.now());
        }

        for (SystemAlert s:
             _alertHistory) {
            for (int a = 0; a < (int)(Math.random() * 3 + 1); a++ ){
                myNotify(s);
            }
        }
    }

    public void addAlert(SystemAlert alert){
        _alertHistory.add(alert);
    }
}
