package Task6.Task6_2;

public class MotorcycleAccountingStrategy implements AccountingStrategy{
    @Override
    public void calculateTax(Transport transport) {
        double tax = transport.getValue() * 0.15;
        System.out.println("Податок на мотоцикл " + tax + transport);
    }
}
