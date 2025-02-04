package Task9.Task9_1;

import java.util.ArrayList;

public class DBAccessProxy implements IDatabaseAccessProxy{
    private DBAccess _dbHandle;


    public DBAccessProxy(DBAccess _dbHandle) {
        this._dbHandle = _dbHandle;
    }

    @Override
    public ArrayList<String> executeQuery(ArrayList<Integer> lineNumbers) {
        return null;
    }

    @Override
    public void executeQueryNoResult(ArrayList<Integer> lineNumbers) {

    }

    @Override
    public boolean checkDatabaseStatus() {
        return false;
    }

    @Override
    public void open(String url) {

    }

    @Override
    public void close() {

    }

    @Override
    public void commit() {

    }

    @Override
    public void rollback() {

    }
}
