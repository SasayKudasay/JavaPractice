package Task9.Task9_1;

import java.util.ArrayList;

public interface IDatabaseAccessProxy {
    ArrayList<String> executeQuery(ArrayList<Integer> lineNumbers);
    void executeQueryNoResult(ArrayList<Integer> lineNumbers);
    boolean checkDatabaseStatus();
    void open(String url);
    void close();
    void commit();
    void rollback();
}
