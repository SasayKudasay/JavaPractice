package Task4.Task4_2;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle1 = new Vehicle("A1234A", true);
        Vehicle vehicle2 = new Vehicle("A1234A", false);

        TaxNotifier taxNotifier = new TaxNotifier("ДержСлужба");
        InsuranceNotifier insuranceNotifier = new InsuranceNotifier("Євроінс");

        VehicleRegistry vehicleRegistry = new VehicleRegistry();

        vehicleRegistry.addVehicle(vehicle1);
        vehicleRegistry.addVehicle(vehicle2);

        vehicleRegistry.subscribe(taxNotifier);
        vehicleRegistry.subscribe(insuranceNotifier);

        vehicleRegistry.myNotifyAll();
    }
}
