package Task6.Task6_2;

import java.util.Objects;

public class ApplicationManager {
    private TransportAccountingSystem system;

    public ApplicationManager(Transport transport) {
        this.system = new TransportAccountingSystem(transport);
        if(Objects.equals(transport.getType(), "car")){
            system.setStrategy(new CarAccountingStrategy());
        } else if (Objects.equals(transport.getType(), "truck")) {
            system.setStrategy(new TruckAccountingStrategy());
        } else if (Objects.equals(transport.getType(), "bus")) {
            system.setStrategy(new BusAccountingStrategy());
        } else if (Objects.equals(transport.getType(), "motorcycle")) {
            system.setStrategy(new MotorcycleAccountingStrategy());
        }
    }

    public static void main(String[] args) {
        Transport transport1 = new Transport("truck", 2000);
        Transport transport2 = new Transport("car", 2000);
        Transport transport3 = new Transport("motorcycle", 2000);
        Transport transport4 = new Transport("bus", 2000);
        ApplicationManager applicationManager1 = new ApplicationManager(transport1);
        ApplicationManager applicationManager2 = new ApplicationManager(transport2);
        ApplicationManager applicationManager3 = new ApplicationManager(transport3);
        ApplicationManager applicationManager4 = new ApplicationManager(transport4);

        applicationManager1.system.calculateTax();
        applicationManager2.system.calculateTax();
        applicationManager3.system.calculateTax();
        applicationManager4.system.calculateTax();
    }
}
