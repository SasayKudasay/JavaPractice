package Task6.Task6_2;

import java.util.ArrayList;
import java.util.Objects;

public class ApplicationManager {
    private ArrayList<Transport> transports = new ArrayList<>();
    private TransportAccountingSystem system;

    public ApplicationManager() {

    }

    public void calculateTax(){
        for (Transport transport:
             transports) {
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
            system.calculateTax();
        }
    }

    public void addTransport(Transport transport){
        transports.add(transport);
    }

    public void removeTransport(Transport transport){
        transports.remove(transport);
    }

    public static void main(String[] args) {
        Transport transport1 = new Transport("truck", 2000);
        Transport transport2 = new Transport("car", 2000);
        Transport transport3 = new Transport("motorcycle", 2000);
        Transport transport4 = new Transport("bus", 2000);
        ApplicationManager applicationManager1 = new ApplicationManager();
        applicationManager1.addTransport(transport1);
        applicationManager1.addTransport(transport2);
        applicationManager1.addTransport(transport3);
        applicationManager1.addTransport(transport4);

        applicationManager1.calculateTax();

    }
}
