package Task9.Task9_2;

public class RegistryController {
    private User _user;
    private ITransportRegistryProxy _Registry;

    public RegistryController(User _user, ITransportRegistryProxy _Registry) {
        this._user = _user;
        this._Registry = _Registry;
    }

    public void addTransport(Transport transport){
        System.out.println("Спроба додати транспорт в реєстр");
        _Registry.addTransport(transport, _user);
    }

    public Transport getTransport(String number){
        System.out.println(_Registry.getTransport(number, _user));
        return  _Registry.getTransport(number, _user);
    }

    public void removeTransport(String number){
        System.out.println("Спроба видалити транспорт");
        _Registry.removeTransport(number, _user);
    }

    public void checkTaxes(String number){
        System.out.println(_user + " отримав дані про податки транспорту " + _Registry.getTransport(number, _user));
        System.out.println(_Registry.checkTaxes(number, _user));
    }
}
