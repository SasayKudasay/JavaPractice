package Task7.Task7_1;

public class PhoneNotifierWrapper extends AbstractWrapper{
    private String _phoneNumber;

    public PhoneNotifierWrapper(INotificationWrapper _wrapper, String _phoneNumber) {
        super(_wrapper);
        this._phoneNumber = _phoneNumber;
    }

    @Override
    public void myNotify(SystemAlert alert) {

        System.out.println("Phone number " + _phoneNumber + ": " + alert);
        super.myNotify(alert);
    }
}
