package Task9.Task9_2;

import java.util.ArrayList;

public class TransportRegistry implements ITransportRegistryProxy{
    private ArrayList<Transport> transports;

    public TransportRegistry() {
        this.transports = new ArrayList<>();
    }

    @Override
    public void addTransport(Transport transport, User user) {
        transports.add(transport);
    }

    @Override
    public void removeTransport(String number, User user) {
        Transport t = null;
        for (Transport transport : transports) {
            if(transport.get_number().equals(number)){
                t = transport;
            }
        }
        if (t != null) {
            transports.remove(t);
        }

    }

    @Override
    public Transport getTransport(String number, User user) {
        for (Transport transport : transports) {
            if(transport.get_number().equals(number)){
                return transport;
            }
        }
        return null;
    }

    @Override
    public int checkTaxes(String number, User user) {
        for (Transport transport : transports) {
            if (transport.get_number().equals(number)) {
                return transport.get_taxes();
            }
        }
        return 0;
    }

}
