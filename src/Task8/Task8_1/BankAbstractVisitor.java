package Task8.Task8_1;

public interface BankAbstractVisitor {
    String visit(User user);
    String visit(Administrator administrator);
    String visit(BankAccountType type);
    String visitBank(BankAccount account);
    String visitInternal(InternalAccount account);
}
