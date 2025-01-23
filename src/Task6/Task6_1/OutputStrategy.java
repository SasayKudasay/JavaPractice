package Task6.Task6_1;

public interface OutputStrategy {
    public void printReport(Document document);
    public void sendReportViaMail(Document document);
    public void sendReportViaTelegram(Document document);
}
