package Task6.Task6_1;

import java.util.Date;
import java.util.Objects;

public class ApplicationManager {
    private OutputController ioController;

    public ApplicationManager(Document document) {
        this.ioController = new OutputController(document);
        if (Objects.equals(System.getProperty("os.name"), "Windows 10")) {
            ioController.setOutputStrategy(new WindowsOutputStrategy());
        } else if (Objects.equals(System.getProperty("os.name"), "Linux")) {
            ioController.setOutputStrategy(new LinuxOutputStrategy());
        } else if (Objects.equals(System.getProperty("os.name"), "ANDROID")) {
            ioController.setOutputStrategy(new AndroidOutputStrategy());
        } else if (Objects.equals(System.getProperty("os.name"), "Mac OS X")){
            ioController.setOutputStrategy(new MacOutputStrategy());
        }
    }


    public static void main(String[] args) {
        Document document = new Document("TEST", new Date(),
                "TEST_CONTENT", new User("TEST_FIRST", "TEST_LAST"));
        ApplicationManager applicationManager = new ApplicationManager(document);

        applicationManager.ioController.printReport();
        applicationManager.ioController.sendReportViaMail();
    }
}
