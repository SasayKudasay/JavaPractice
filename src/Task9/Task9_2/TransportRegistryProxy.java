package Task9.Task9_2;

public class TransportRegistryProxy implements ITransportRegistryProxy {
    private TransportRegistry transportRegistry;
    private User user;

    public TransportRegistryProxy(TransportRegistry transportRegistry) {
        this.transportRegistry = transportRegistry;
    }

    @Override
    public void addTransport(Transport transport, User user) {
        if(user.is_isAdmin()){
            System.out.println("успішно");
            transportRegistry.addTransport(transport, user);
        } else {
            System.out.println("Нема доступу");
        }
    }

    @Override
    public void removeTransport(String number, User user) {
        if(user.is_isAdmin()){
            transportRegistry.removeTransport(number, user);
            System.out.println("Успішно");
        } else {
            System.out.println("Нема доступу");
        }
    }

    @Override
    public Transport getTransport(String number, User user) {
        System.out.println(user + " отримав дані про машину");
        return transportRegistry.getTransport(number, user);
    }

    @Override
    public int checkTaxes(String number, User user) {
        System.out.println(user + " отримав дані про податки про машину");
        return transportRegistry.checkTaxes(number, user);
    }

}
