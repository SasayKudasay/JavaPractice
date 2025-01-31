package Task8.Task8_1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("COUNTRY", "REGION", "CITY");
        User user = new User("FIRSTNAME", "LASTNAME", LocalDate.now(), address);
        Administrator administrator = new Administrator("FIRSTNAME", "LASTNAME", LocalDate.now(), address,
                "DEPARTMENT", LocalDate.now());
        BankAccount bankAccount = new BankAccount(100000, LocalDate.now(), user, administrator,
                2000, true, BankAccountType.PLATINUM);
        InternalAccount internalAccount = new InternalAccount(343434, LocalDate.now(), "NAME", "OWNER");

        AccountStorage storage = new AccountStorage("db");
        storage.addAccount(bankAccount);
        storage.addAccount(internalAccount);

        storage.save();
        System.out.println();
        storage.changeFormat("json");
        storage.save();
    }
}
