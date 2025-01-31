package Task8.Task8_1;

public class BankDatabaseVisitor implements BankAbstractVisitor{
    public BankDatabaseVisitor() {
    }

    @Override
    public String visit(User user) {
        return "DATABASE: " + user;
    }

    @Override
    public String visit(Administrator administrator) {
        return "DATABASE: " + administrator;
    }

    @Override
    public String visit(BankAccountType type) {
        return "DATABASE: " + type;
    }

    @Override
    public String visitBank(BankAccount account) {
        return "DATABASE: " + account;
    }

    @Override
    public String visitInternal(InternalAccount account) {
        return "DATABASE: " + account;
    }
}
