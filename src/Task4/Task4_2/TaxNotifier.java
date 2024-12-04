package Task4.Task4_2;

public class TaxNotifier implements Observer{
    private String _nameTax;

    public TaxNotifier(String _nameTax) {
        this._nameTax = _nameTax;
    }

    @Override
    public void myNotify(Vehicle vehicle) {
        System.out.println("Налогова служба " + _nameTax +" отримала інформацію про транспорт " +
                vehicle.getVehicleNumber() + " який заєрестрований: " + vehicle.isStatus());
    }
}
