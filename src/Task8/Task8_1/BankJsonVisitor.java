package Task8.Task8_1;

public class BankJsonVisitor implements BankAbstractVisitor{

    public BankJsonVisitor() {
    }

    @Override
    public String visit(User user) {
        return "JSON: " + user;
    }

    @Override
    public String visit(Administrator administrator) {
        return "JSON: " + administrator;
    }

    @Override
    public String visit(BankAccountType type) {
        return "JSON: " + type;
    }

    @Override
    public String visitBank(BankAccount account) {
        return "JSON: " + account;
    }

    @Override
    public String visitInternal(InternalAccount account) {
        return "JSON: " + account;
    }
}
