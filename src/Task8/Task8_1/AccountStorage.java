package Task8.Task8_1;

import java.util.ArrayList;

public class AccountStorage {
    private ArrayList<Accountable> accountInfo = new ArrayList<>();
    private BankAbstractVisitor serializer;

    public AccountStorage(String s) {
        changeFormat(s);
    }

    public void changeFormat(String format){
        if (format.equals("db")) {
            serializer = new BankDatabaseVisitor();
        } else if (format.equals("json")) {
            serializer = new BankJsonVisitor();
        }
    }

    public void save(){
        for(var acc : accountInfo)
        {
            String out = acc.accept(serializer);
            System.out.println(out);
        }
    }

    public void addAccount(Accountable account){
        accountInfo.add(account);
    }
}
