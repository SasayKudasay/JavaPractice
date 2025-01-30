package Task7.Task7_1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SystemAlert alert = new SystemAlert(AlertSeverity.CRITICAL, "TEXT", "MEOW");

        INotificationWrapper wrapper = new TelegramNotifierWrapper(null, "USER123");

        int i = (int) (Math.random() * 100 + 1);
        alert.set_executionCode(i);
        alert.set_timestamp(LocalDate.now());

        if(alert.get_executionCode() > 20){
            wrapper = new SysLogNotifierWrapper(wrapper, "JORNO JOVANA");
        }
        if (alert.get_executionCode() > 30 ) {
            wrapper = new EmailNotifierWrapper(wrapper, "EMAIL");
        }
        if (alert.get_executionCode() > 50 ) {
            wrapper = new PhoneNotifierWrapper(wrapper, "111111");
        }


        SystemController systemController = new SystemController(wrapper);
        systemController.addAlert(alert);
        systemController.informAlert();
    }
}
