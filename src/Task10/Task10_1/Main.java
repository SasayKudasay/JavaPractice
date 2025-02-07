package Task10.Task10_1;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MongoDatabaseAdapter mAdapter = new MongoDatabaseAdapter("webToken", 10);
        MsSQLDatabaseAdapter msAdapter = new MsSQLDatabaseAdapter("MsSQL.txt", false);
        PostgreesSQLDatabaseAdapter pAdapter = new PostgreesSQLDatabaseAdapter("Postgrees.txt", false);

        ArrayList<IDatabaseDriverAdapter> adapters = new ArrayList<>();
        adapters.add(mAdapter);
        adapters.add(msAdapter);
        adapters.add(pAdapter);

        for (IDatabaseDriverAdapter a : adapters){
            DBAccess dbAccess = new DBAccess( false, a);
            DBAccessProxy dbAccessProxy = new DBAccessProxy(dbAccess);

            DatabaseController databaseController = new DatabaseController(dbAccessProxy);
            databaseController.addClient(a.getUrl());
            databaseController.addOrder(a.getUrl());
        }

    }
}
