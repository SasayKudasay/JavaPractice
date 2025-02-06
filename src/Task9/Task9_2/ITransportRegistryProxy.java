package Task9.Task9_2;

public interface ITransportRegistryProxy {
    void addTransport(Transport transport, User user);
    void removeTransport(String number, User user);
    Transport getTransport(String number, User user);
    int checkTaxes(String number, User user);
}
