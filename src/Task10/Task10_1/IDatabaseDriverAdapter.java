package Task10.Task10_1;

import java.util.ArrayList;

public interface IDatabaseDriverAdapter {
    ArrayList<String> executeQuery(ArrayList<Integer> lineNumbers);
    void executeQueryNoResult(ArrayList<Integer> lineNumbers);
    boolean checkDatabaseStatus();
    void open(String url);
    void close();
    void commit();
    void rollback();
    void addLines(String line);
    String getUrl();
}
