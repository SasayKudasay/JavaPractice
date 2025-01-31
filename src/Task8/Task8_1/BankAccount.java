package Task8.Task8_1;

import java.time.LocalDate;

public class BankAccount extends Accountable{
    private User client;
    private Administrator administrator;
    private long currentBalance;
    private boolean isCredit;
    private BankAccountType type;

    public BankAccount(long id, LocalDate creationTime, User client, Administrator administrator,
                       long currentBalance, boolean isCredit, BankAccountType type) {
        super(id, creationTime);
        this.client = client;
        this.administrator = administrator;
        this.currentBalance = currentBalance;
        this.isCredit = isCredit;
        this.type = type;
    }

    @Override
    public String accept(BankAbstractVisitor visitor) {
        return visitor.visitBank(this);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "client=" + client +
                ", administrator=" + administrator +
                ", currentBalance=" + currentBalance +
                ", isCredit=" + isCredit +
                '}';
    }
}
