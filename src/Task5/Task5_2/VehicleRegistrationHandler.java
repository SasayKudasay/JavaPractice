package Task5.Task5_2;

import java.util.ArrayList;

public abstract class VehicleRegistrationHandler {
    private ArrayList<VehicleRegistrationHandler> handlers;

    public VehicleRegistrationHandler() {
        this.handlers = new ArrayList<>();
    }

    public void handle(TransportInfo transportInfo){
        for (VehicleRegistrationHandler handler:
             handlers) {
            handler.handle(transportInfo);
        }
    }

    public void addHandler(VehicleRegistrationHandler handler){
        handlers.add(handler);
    }

    public void removeHandler(VehicleRegistrationHandler handler){
        handlers.remove(handler);
    }
}
