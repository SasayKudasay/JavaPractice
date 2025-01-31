package Task7.Task7_2;

import java.util.ArrayList;

public class TransportRegistry {
    private ArrayList<Transport> transports = new ArrayList<>();
    private IHandlerDecorator handler;

    public TransportRegistry(IHandlerDecorator handler) {
        this.handler = handler;
    }

    public void handle(){
        for(Transport transport: transports){
            System.out.println(handler.getDescription(transport));
            System.out.println("Податок : " + handler.getRegistrationFee(transport));
            System.out.println();
        }
    }

    public void addTransport(Transport transport){
        transports.add(transport);
    }

    public void removeTransport(Transport transport){
        transports.remove(transport);
    }


}
