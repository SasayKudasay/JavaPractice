package Task10.Task10_2;

import java.util.ArrayList;

public class CarAdapter implements TransportAdapter{
    private ArrayList<Car> cars = new ArrayList<>();

    @Override
    public void addTransport(AbstractTransport transport, User user) {
        if(transport instanceof  Car){
            Car c = (Car) transport;
            cars.add(c);
        }
    }

    @Override
    public void removeTransport(String number, User user) {
        AbstractTransport t = null;
        for (Car transport : cars) {
            if(transport.get_number().equals(number)){
                t = transport;
            }
        }
        if (t != null) {
            cars.remove(t);
        }
    }

    @Override
    public AbstractTransport getTransport(String number, User user) {
        for (Car transport : cars) {
            if(transport.get_number().equals(number)){
                return transport;
            }
        }
        return null;
    }

    @Override
    public double checkTaxes(String number, User user) {
        for (Car transport : cars) {
            if (transport.get_number().equals(number)) {
                if(transport.is_isDiesel()){
                    return transport.get_baseTaxes() * 0.5;
                } else return transport.get_baseTaxes();
            }
        }
        return 0;
    }

    @Override
    public boolean supports(AbstractTransport transport) {
        return transport instanceof Car;
    }
}
