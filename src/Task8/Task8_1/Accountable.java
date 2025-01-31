package Task8.Task8_1;

import java.time.LocalDate;

public abstract class Accountable {
    private long id;
    private LocalDate creationTime;

    public Accountable(long id, LocalDate creationTime) {
        this.id = id;
        this.creationTime = creationTime;
    }

    public abstract String  accept(BankAbstractVisitor visitor);

    @Override
    public String toString() {
        return "Accountable{" +
                "id=" + id +
                ", creationTime=" + creationTime +
                '}';
    }
}
