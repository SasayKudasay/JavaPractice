package Task8.Task8_2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("X", 2000);
        Truck truck = new Truck("Y", 4000);

        TransportRegistry transportRegistry = new TransportRegistry();

        transportRegistry.addTransport(car);
        transportRegistry.addTransport(truck);

        transportRegistry.displayTransports();
        transportRegistry.taxTransports();
    }
}
