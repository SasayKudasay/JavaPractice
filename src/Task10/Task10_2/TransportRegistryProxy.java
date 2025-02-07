package Task10.Task10_2;


public class TransportRegistryProxy implements ITransportRegistryProxy {
    private TransportRegistry transportRegistry;
    private User user;

    public TransportRegistryProxy(TransportRegistry transportRegistry) {
        this.transportRegistry = transportRegistry;
    }

    @Override
    public void addTransport(AbstractTransport transport, User user) {
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
    public AbstractTransport getTransport(String number, User user) {
        System.out.println(user + " отримав дані про машину");
        return transportRegistry.getTransport(number, user);
    }

    @Override
    public double checkTaxes(String number, User user) {
        System.out.println(user + " отримав дані про податки про машину");
        return transportRegistry.checkTaxes(number, user);
    }

}
