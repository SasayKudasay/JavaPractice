package Task4.Task4_1;

import Task4.Task4_1.Notifiers.EmailNotifier;
import Task4.Task4_1.Notifiers.PhoneNotifer;
import Task4.Task4_1.Notifiers.SysLogNotifier;
import Task4.Task4_1.Notifiers.TelegramNotifier;

public class Main {
    static PhoneNotifer phoneNotifer = new PhoneNotifer("+4839493848");
    static TelegramNotifier telegramNotifier = new TelegramNotifier("@ksdjajk", true);
    static SysLogNotifier sysLogNotifier = new SysLogNotifier("LOG");
    static EmailNotifier emailNotifier = new EmailNotifier("Gmail");

    public static void main(String[] args) {

        BuilderSysAlert bs1 = new BuilderSysAlert();
        bs1.setBasicParams(AlertSeverity.DEBUG, "Aboba");
        bs1.setProcessParam("Meow");

        BuilderSysAlert bs2 = new BuilderSysAlert();
        bs2.setBasicParams(AlertSeverity.CRITICAL, "Oh no");
        bs2.setProcessParam("Desktop application: 73783");

        SystemController systemController = new SystemController();
        systemController.addAlert(bs1.build());
        systemController.addAlert(bs2.build());

        systemController.subscribe(phoneNotifer);
        systemController.subscribe(telegramNotifier);
        systemController.subscribe(sysLogNotifier);
        systemController.subscribe(emailNotifier);

        systemController.informAlert();
    }
}
