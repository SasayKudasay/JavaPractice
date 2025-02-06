package Task9.Task9_2;

public class Transport {
    private String _number;
    private int _taxes;
    private String _model;

    public Transport(String _number, int _taxes, String _model) {
        this._number = _number;
        this._taxes = _taxes;
        this._model = _model;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "_number='" + _number + '\'' +
                ", _taxes=" + _taxes +
                ", _model='" + _model + '\'' +
                '}';
    }

    public String get_number() {
        return _number;
    }

    public void set_number(String _number) {
        this._number = _number;
    }

    public int get_taxes() {
        return _taxes;
    }

    public void set_taxes(int _taxes) {
        this._taxes = _taxes;
    }

    public String get_model() {
        return _model;
    }

    public void set_model(String _model) {
        this._model = _model;
    }
}
