package Task10.Task10_2;

public class Main {
    public static void main(String[] args) {

        TransportRegistry registry = new TransportRegistry();
        TransportRegistryProxy proxy = new TransportRegistryProxy(registry);

        User admin = new User("MEOW", "MEOOOOW", true);
        RegistryController controller = new RegistryController(admin, proxy);

        Truck truck = new Truck("123", 200, "S", 300);
        Car car = new Car("234", 100, "M", true);

        controller.addTransport(truck);
        controller.addTransport(car);
        controller.getTransport("123");
        controller.getTransport("234");
        controller.checkTaxes("123");
        controller.checkTaxes("234");
        controller.removeTransport("123");
        controller.getTransport("123");
    }
}
