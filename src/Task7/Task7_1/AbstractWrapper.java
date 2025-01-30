package Task7.Task7_1;

public abstract class AbstractWrapper implements INotificationWrapper {
    private INotificationWrapper _wrapper;

    public AbstractWrapper(INotificationWrapper _wrapper) {
        this._wrapper = _wrapper;
    }

    @Override
    public void myNotify(SystemAlert alert) {
        if(_wrapper != null){
            _wrapper.myNotify(alert);
        }
    }
}
