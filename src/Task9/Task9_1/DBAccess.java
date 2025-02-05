package Task9.Task9_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DBAccess implements IDatabaseAccessProxy {
    private String _url;
    private boolean _isOpen;
    private List<String> databaseLines;

    public DBAccess( boolean isOpen) {
        this._isOpen = isOpen;
        this.databaseLines = new ArrayList<>();
    }

    @Override
    public ArrayList<String> executeQuery(ArrayList<Integer> lineNumbers) {
        ArrayList<String> results = new ArrayList<>();
        if (!_isOpen) {
            System.out.println("Database is not open.");
            return results;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(_url))) {
            List<String> allLines = reader.lines().collect(Collectors.toList());
            for (Integer lineNumber : lineNumbers) {
                if (lineNumber >= 0 && lineNumber < allLines.size()) {
                    results.add(allLines.get(lineNumber));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return results;
    }

    @Override
    public void executeQueryNoResult(ArrayList<Integer> lineNumbers) {
        if (!_isOpen) {
            System.out.println("БД закрито");
            return;
        }
        try {
            List<String> allLines = new ArrayList<>(databaseLines);
            List<String> updatedLines = allLines.stream()
                    .filter(line -> !lineNumbers.contains(allLines.indexOf(line)))
                    .collect(Collectors.toList());

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(_url))) {
                for (String line : updatedLines) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            databaseLines = updatedLines;
            System.out.println("Дані були видалені");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean checkDatabaseStatus() {
        return _isOpen;
    }

    @Override
    public void open(String url) {
        File file = new File(url);
        try {
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println(url + " Файл створен");
                } else {
                    System.out.println("Не вдалося створити файл " + url);
                }
            } else {
                System.out.println("Файл " + url + " вже існує");
            }
            this._url = url;
            this._isOpen = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        if (_isOpen) {
            _isOpen = false;
            System.out.println("БД закрито");
        }
    }

    @Override
    public void commit() {
        if (!_isOpen) {
            System.out.println("БД закрито");
            return;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(_url,true))) {
            for (String line : databaseLines) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Зміни були додані");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rollback() {
        if (!_isOpen) {
            System.out.println("БД закрито");
            return;
        }
        System.out.println("Пробачте, але реалізація відкату відсутня");
    }

    @Override
    public void addLines(String line) {
        this.databaseLines.clear();
        this.databaseLines.add(line);
    }
}
