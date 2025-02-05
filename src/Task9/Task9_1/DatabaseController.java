package Task9.Task9_1;

import java.util.ArrayList;
import java.util.Scanner;

public class DatabaseController {
    private IDatabaseAccessProxy dbHandle;

    public DatabaseController(IDatabaseAccessProxy dbHandle) {
        this.dbHandle = dbHandle;
    }

    public void addClient(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть данні для збереження");
        String clientData = scanner.nextLine();
        dbHandle.addLines(clientData);
        dbHandle.open("DB.txt");
        dbHandle.commit();
        dbHandle.close();
    }

    public void removeClient(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число клієнта для видалення:");
        int lineNumber = scanner.nextInt();
        ArrayList<Integer> linesToRemove = new ArrayList<>();
        linesToRemove.add(lineNumber);
        dbHandle.open("DB.txt");
        dbHandle.executeQueryNoResult(linesToRemove);
        System.out.println("Клієнт видален.");
        dbHandle.close();
    }

    public void modifyOrder(){
        System.out.println("Функція модифікації недоступна");
    }

    public void addOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть дані заказу:");
        String orderData = scanner.nextLine();
        dbHandle.open("DB.txt");
        dbHandle.addLines(orderData);
        dbHandle.commit();
        dbHandle.close();
    }

    public void removeOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер строки заказу для видалення:");
        int lineNumber = scanner.nextInt();
        ArrayList<Integer> linesToRemove = new ArrayList<>();
        linesToRemove.add(lineNumber);
        dbHandle.open("DB.txt");
        dbHandle.executeQueryNoResult(linesToRemove);
        dbHandle.close();
        System.out.println("Заказ видален.");
    }
}
