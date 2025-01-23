package Task6.Task6_1;

public class WindowsOutputStrategy implements OutputStrategy{
    @Override
    public void printReport(Document document) {
        System.out.println(document);
        System.out.println("WINDOWS");
    }

    @Override
    public void sendReportViaMail(Document document) {
        System.out.println(document + " sent via mail");
        System.out.println("WINDOWS");
    }

    @Override
    public void sendReportViaTelegram(Document document) {
        System.out.println(document + " sent via telegram");
        System.out.println("WINDOWS");
    }
}
