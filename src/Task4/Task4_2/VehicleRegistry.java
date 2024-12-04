package Task4.Task4_2;

import java.util.ArrayList;

public class VehicleRegistry extends Observable{
    private ArrayList<Vehicle> _vehicleArrayList = new ArrayList<>();

    public VehicleRegistry() {
    }

    public void addVehicle(Vehicle vehicle){
        _vehicleArrayList.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        _vehicleArrayList.remove(vehicle);
    }

    public void myNotifyAll(){
        for (Vehicle v:
             _vehicleArrayList) {
            v.setVehicleNumber("A" + (int)(Math.random() * 9999 + 1000) + "B");
            v.setStatus((int) (Math.random() * 10 + 1) % 2 == 0);
        }

        int random = (int)(Math.random() * 3 + 1);

        for (Vehicle v:
                _vehicleArrayList) {
            for (int a = 0; a < random; a++ ){
                myNotify(v);
                System.out.println();
            }
        }
    }
}
