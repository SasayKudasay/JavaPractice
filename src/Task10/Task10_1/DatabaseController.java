package Task10.Task10_1;

import java.util.ArrayList;
import java.util.Scanner;

public class DatabaseController {
    private String _url;
    private IDatabaseAccessProxy dbHandle;

    public DatabaseController(IDatabaseAccessProxy dbHandle) {
        this.dbHandle = dbHandle;
    }

    public void addClient(String _url){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть данні для збереження");
        String clientData = scanner.nextLine();
        dbHandle.addLines(clientData);
        dbHandle.open(_url);
        dbHandle.commit();
        dbHandle.close();
    }

    public void removeClient(String _url){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число клієнта для видалення:");
        int lineNumber = scanner.nextInt();
        ArrayList<Integer> linesToRemove = new ArrayList<>();
        linesToRemove.add(lineNumber);
        dbHandle.open(_url);
        dbHandle.executeQueryNoResult(linesToRemove);
        System.out.println("Клієнт видален.");
        dbHandle.close();
    }

    public void modifyOrder(String _url){
        System.out.println("Функція модифікації недоступна");
    }

    public void addOrder(String _url){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть дані заказу:");
        String orderData = scanner.nextLine();
        dbHandle.open(_url);
        dbHandle.addLines(orderData);
        dbHandle.commit();
        dbHandle.close();
    }

    public void removeOrder(String _url){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер строки заказу для видалення:");
        int lineNumber = scanner.nextInt();
        ArrayList<Integer> linesToRemove = new ArrayList<>();
        linesToRemove.add(lineNumber);
        dbHandle.open( _url);
        dbHandle.executeQueryNoResult(linesToRemove);
        dbHandle.close();
        System.out.println("Заказ видален.");
    }
}
