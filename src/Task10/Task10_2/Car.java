package Task10.Task10_2;

public class Car extends AbstractTransport {
    private boolean _isDiesel;

    public Car(String _number, int _taxes, String _model, boolean _isDiesel) {
        super(_number, _taxes, _model);
        this._isDiesel = _isDiesel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "_isDiesel=" + _isDiesel +
                '}';
    }

    public boolean is_isDiesel() {
        return _isDiesel;
    }

    public void set_isDiesel(boolean _isDiesel) {
        this._isDiesel = _isDiesel;
    }
}
