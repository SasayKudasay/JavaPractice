package Task9.Task9_1;

public class Main {
    public static void main(String[] args) {
        DBAccess dbAccess = new DBAccess("TEXT.txt", false);
        DBAccessProxy dbAccessProxy = new DBAccessProxy(dbAccess);

        DatabaseController databaseController = new DatabaseController(dbAccessProxy);

        databaseController.addClient();
        databaseController.addOrder();
        databaseController.removeClient();
        databaseController.modifyOrder();
        databaseController.removeClient();
    }
}
