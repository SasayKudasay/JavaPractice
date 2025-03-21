package Task10.Task10_2;

public interface ITransportRegistryProxy {
    void addTransport(AbstractTransport transport, User user);
    void removeTransport(String number, User user);
    AbstractTransport getTransport(String number, User user);
    double checkTaxes(String number, User user);
}
