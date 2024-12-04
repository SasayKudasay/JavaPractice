package Task4.Task4_2;

public class InsuranceNotifier implements Observer{
    private String _nameInsurance;

    public InsuranceNotifier(String _nameInsurance) {
        this._nameInsurance = _nameInsurance;
    }

    @Override
    public void myNotify(Vehicle vehicle) {
        System.out.println("Страхова компанія " + _nameInsurance + "отримала інформацію про транспорт " +
                vehicle.getVehicleNumber() + " який заєрестрований " + vehicle.isStatus());
    }
}
