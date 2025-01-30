package Task7.Task7_1;

public class EmailNotifierWrapper extends AbstractWrapper{
    private String _uniqueName;

    public EmailNotifierWrapper(INotificationWrapper _wrapper, String _uniqueName) {
        super(_wrapper);
        this._uniqueName = _uniqueName;
    }

    @Override
    public void myNotify(SystemAlert alert) {

        System.out.println("Email notify :"+ _uniqueName +" :" + alert);
        super.myNotify(alert);
    }
}
