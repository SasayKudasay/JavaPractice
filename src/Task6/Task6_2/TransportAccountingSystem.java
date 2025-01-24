package Task6.Task6_2;

public class TransportAccountingSystem {
    private Transport transport;
    private AccountingStrategy strategy;

    public TransportAccountingSystem(Transport transport) {
        this.transport = transport;
    }

    public void calculateTax(){
        strategy.calculateTax(transport);
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public AccountingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(AccountingStrategy strategy) {
        this.strategy = strategy;
    }
}
