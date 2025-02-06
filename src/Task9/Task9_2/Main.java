package Task9.Task9_2;

public class Main {
    public static void main(String[] args) {
        TransportRegistry transportRegistry = new TransportRegistry();
        TransportRegistryProxy proxy = new TransportRegistryProxy(transportRegistry);

        User user = new User("Bob", "USER", false);
        User user1 = new User("Admin", "ADMIN", true);

        Transport transport = new Transport("123", 100, "S");
        Transport transport1 = new Transport("234", 50, "Meow");

        RegistryController controllerForUser = new RegistryController(user, proxy);
        RegistryController controllerForAdmin = new RegistryController(user1, proxy);

        controllerForAdmin.addTransport(transport);
        controllerForUser.addTransport(transport1);

        controllerForAdmin.getTransport("123");
        controllerForUser.getTransport("123");

        controllerForAdmin.checkTaxes("123");
        controllerForUser.checkTaxes("123");

        controllerForUser.removeTransport("123");
        controllerForAdmin.removeTransport("123");
    }
}
