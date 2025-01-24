package Task6.Task6_2;

public class BusAccountingStrategy implements AccountingStrategy{
    @Override
    public void calculateTax(Transport transport) {
        double tax = transport.getValue() * 0.2;
        System.out.println("Налог на автобус " + tax + transport);
    }
}
