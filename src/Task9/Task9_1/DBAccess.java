package Task9.Task9_1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DBAccess implements IDatabaseAccessProxy{
    private String _url;
    private boolean _isOpen;

    public DBAccess(String _url, boolean _isOpen) {
        this._url = _url;
        this._isOpen = _isOpen;
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
        File file = new File(url);
        try {
            if(file.createNewFile()){
                System.out.println(url + " Файл створен");
            } else {
                System.out.println("Файл " + url + " уже существует");
            }
        } catch (IOException e){
            e.printStackTrace();
        }

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
