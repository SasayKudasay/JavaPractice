package Task1.Task1_2;

import java.util.ArrayList;
import java.util.HashMap;

public class TransportRegistry {
    private String _name;
    private short _createdAt;
    private ArrayList<Transport> vehicles = new ArrayList<>();
    private static HashMap<String, TransportRegistry> _instance = new HashMap<>();

    private TransportRegistry(String _name) {
        this._name = _name;
    }

    public static TransportRegistry getInstance(String name){
        if(!_instance.containsKey(name)){
            _instance.put(name, new TransportRegistry(name));
        }
        return _instance.get(name);
    }

    public boolean addTransport(Transport transport){
        return vehicles.add(transport);
    }

    public boolean removeTransport(Transport transport){
        return vehicles.remove(transport);
    }

    public Transport getTransport(Short transportID){
        for (Transport t:
             vehicles) {
            if(t.get_VehicleID() == transportID){
                return  t;
            }
        }
        return null;
    }

    public long getVehicleCount(){
        return vehicles.size();
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public short get_createdAt() {
        return _createdAt;
    }

    public void set_createdAt(short _createdAt) {
        this._createdAt = _createdAt;
    }

    public ArrayList<Transport> getVehicles() {
        return vehicles;
    }


}
