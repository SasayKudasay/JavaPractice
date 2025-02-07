package Task10.Task10_2;

import java.util.ArrayList;
import java.util.List;

public class TransportRegistry implements ITransportRegistryProxy {
    private List<TransportAdapter> adapters;

    public TransportRegistry() {
        this.adapters = new ArrayList<>();
        adapters.add(new CarAdapter());
        adapters.add(new TruckAdapter());
    }

    @Override
    public void addTransport(AbstractTransport transport, User user) {
        for (TransportAdapter adapter : adapters) {
            if (adapter.supports(transport)) {
                adapter.addTransport(transport, user);
                return;
            }
        }
        System.out.println("Немає підходящого адаптера для транспорту " + transport);
    }

    @Override
    public void removeTransport(String number, User user) {
        for (TransportAdapter adapter : adapters) {
            adapter.removeTransport(number, user);
        }
    }

    @Override
    public AbstractTransport getTransport(String number, User user) {
        for (TransportAdapter adapter : adapters) {
            AbstractTransport transport = adapter.getTransport(number, user);
            if (transport != null) {
                return transport;
            }
        }
        System.out.println("Транспорт не знайдено: " + number);
        return null;
    }

    @Override
    public double checkTaxes(String number, User user) {
        for (TransportAdapter adapter : adapters) {
            return adapter.checkTaxes(number, user);
        }
        System.out.println("Немає даних про податки для: " + number);
        return 0;
    }
}
