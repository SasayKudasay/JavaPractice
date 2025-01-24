package Task6.Task6_2;

public class TruckAccountingStrategy implements AccountingStrategy{
    @Override
    public void calculateTax(Transport transport) {
        double tax = transport.getValue() * 0.3;
        System.out.println("Налог на вантажівку " + tax + transport);
    }
}
