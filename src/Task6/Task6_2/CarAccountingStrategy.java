package Task6.Task6_2;

public class CarAccountingStrategy implements AccountingStrategy{
    @Override
    public void calculateTax(Transport transport) {
        double tax = transport.getValue() * 0.1;
        System.out.println("Налог на автомобіль " + tax + transport);
    }
}
