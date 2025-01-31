package Task8.Task8_1;

import java.time.LocalDate;

public class InternalAccount extends Accountable{

    private String name;
    private String owner;

    public InternalAccount(long id, LocalDate creationTime, String name, String owner) {
        super(id, creationTime);
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String accept(BankAbstractVisitor visitor) {
        return visitor.visitInternal(this);
    }

    @Override
    public String toString() {
        return "InternalAccount{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
