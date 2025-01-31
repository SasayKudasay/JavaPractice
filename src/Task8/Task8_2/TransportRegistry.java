package Task8.Task8_2;

import java.util.ArrayList;

public class TransportRegistry {
    private ArrayList<Transport> transports = new ArrayList<>();
    private TransportVisitor visitor;

    public void displayTransports(){
        this.visitor = new DisplayVisitor();
        for(Transport transport : transports){
            transport.accept(visitor);
        }
    }

    public void taxTransports(){
        this.visitor = new TaxVisitor();
        for(Transport transport : transports){
            transport.accept(visitor);
        }
    }

    public void addTransport(Transport transport){
        transports.add(transport);
    }

    public void removeTransport(Transport transport){
        transports.remove(transport);
    }
}
