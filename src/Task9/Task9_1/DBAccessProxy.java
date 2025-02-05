package Task9.Task9_1;

import java.util.ArrayList;

public class DBAccessProxy implements IDatabaseAccessProxy{
    private DBAccess _dbHandle;


    public DBAccessProxy(DBAccess _dbHandle) {
        this._dbHandle = _dbHandle;
    }

    @Override
    public ArrayList<String> executeQuery(ArrayList<Integer> lineNumbers) {
        System.out.println("Дані отримані через прокси");
        return _dbHandle.executeQuery(lineNumbers);
    }

    @Override
    public void executeQueryNoResult(ArrayList<Integer> lineNumbers) {
        System.out.println("Дані були видалені через проксі");
        _dbHandle.executeQueryNoResult(lineNumbers);
    }

    @Override
    public boolean checkDatabaseStatus() {
        System.out.println("Статус проксі" + checkDatabaseStatus());
        return _dbHandle.checkDatabaseStatus();
    }

    @Override
    public void open(String url) {
        System.out.println(url);
        _dbHandle.open(url);
    }

    @Override
    public void close() {
        System.out.println("Proxy closed");
        _dbHandle.close();
    }

    @Override
    public void commit() {
        System.out.println("Proxy commited");
        _dbHandle.commit();
    }

    @Override
    public void rollback() {
        System.out.println("Meow PROXY");
        _dbHandle.rollback();
    }

    @Override
    public void addLines(String line) {
        _dbHandle.addLines(line);
    }
}
