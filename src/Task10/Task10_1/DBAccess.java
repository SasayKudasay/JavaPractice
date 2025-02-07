package Task10.Task10_1;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DBAccess implements IDatabaseAccessProxy {
    private String _url;
    private boolean _isOpen;
    private IDatabaseDriverAdapter _impl;

    public DBAccess(boolean _isOpen, IDatabaseDriverAdapter _impl) {
        this._isOpen = _isOpen;
        this._impl = _impl;
    }

    @Override
    public ArrayList<String> executeQuery(ArrayList<Integer> lineNumbers) {
        return _impl.executeQuery(lineNumbers);
    }

    @Override
    public void executeQueryNoResult(ArrayList<Integer> lineNumbers) {
        _impl.executeQueryNoResult(lineNumbers);
    }

    @Override
    public boolean checkDatabaseStatus() {
        return _isOpen;
    }

    @Override
    public void open(String url) {
        _impl.open(url);
    }

    @Override
    public void close() {
        _impl.close();
    }

    @Override
    public void commit() {
        _impl.commit();
    }

    @Override
    public void rollback() {
        _impl.rollback();
    }

    @Override
    public void addLines(String line) {
        _impl.addLines(line);
    }

    @Override
    public String getUrl() {
        return _impl.getUrl();
    }
}
