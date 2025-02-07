package Task10.Task10_2;

import java.util.ArrayList;

public class TruckAdapter implements TransportAdapter{
    private ArrayList<Truck> trucks = new ArrayList<>();

    @Override
    public void addTransport(AbstractTransport transport, User user) {
        if(transport instanceof  Car){
            Truck truck = (Truck) transport;
            trucks.add(truck);
        }
    }

    @Override
    public void removeTransport(String number, User user) {
        AbstractTransport t = null;
        for (Truck transport : trucks) {
            if(transport.get_number().equals(number)){
                t = transport;
            }
        }
        if (t != null) {
            trucks.remove(t);
        }
    }

    @Override
    public AbstractTransport getTransport(String number, User user) {
        for (Truck transport : trucks) {
            if(transport.get_number().equals(number)){
                return transport;
            }
        }
        return null;
    }

    @Override
    public double checkTaxes(String number, User user) {
        for (Truck transport : trucks) {
            if (transport.get_number().equals(number)) {
                if(transport.get_capacity() > 200){
                    return transport.get_baseTaxes() * 0.2;
                } else return transport.get_baseTaxes();
            }
        }
        return 0;
    }

    @Override
    public boolean supports(AbstractTransport transport) {
        return transport instanceof Truck;
    }
}
