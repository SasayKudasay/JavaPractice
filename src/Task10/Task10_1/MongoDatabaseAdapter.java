package Task10.Task10_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MongoDatabaseAdapter implements IDatabaseDriverAdapter{
    private String _webToken;
    private long _expirationTime;
    private List<String> databaseLines = new ArrayList<>();

    public MongoDatabaseAdapter(String _webToken, long _expirationTime) {
        this._webToken = _webToken;
        this._expirationTime = _expirationTime;
    }

    public ArrayList<String> executeQuery(ArrayList<Integer> lineNumbers) {
        ArrayList<String> results = new ArrayList<>();
        if (_expirationTime < 1) {
            System.out.println("Database is not open.");
            return results;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("Mongo.txt"))) {
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
        if (_expirationTime < 1) {
            System.out.println("БД закрито");
            return;
        }
        try {
            List<String> allLines = new ArrayList<>(databaseLines);
            List<String> updatedLines = allLines.stream()
                    .filter(line -> !lineNumbers.contains(allLines.indexOf(line)))
                    .collect(Collectors.toList());

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("Mongo.txt"))) {
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
        return _expirationTime > 1;
    }

    @Override
    public void open(String url) {
        File file = new File("Mongo.txt");
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        if (_expirationTime > 1) {
            _expirationTime = 0;
            System.out.println("БД закрито");
        }
    }

    @Override
    public void commit() {
        if (_expirationTime < 1) {
            System.out.println("БД закрито");
            return;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Mongo.txt",true))) {
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
        if (_expirationTime < 1) {
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

    @Override
    public String getUrl() {
        return _webToken;
    }
}
