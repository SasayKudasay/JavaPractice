package Task10.Task10_2;

public abstract class AbstractTransport {
    private String _number;
    private int _baseTaxes;
    private String _model;

    public AbstractTransport(String _number, int _taxes, String _model) {
        this._number = _number;
        this._baseTaxes = _taxes;
        this._model = _model;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "_number='" + _number + '\'' +
                ", _taxes=" + _baseTaxes +
                ", _model='" + _model + '\'' +
                '}';
    }

    public String get_number() {
        return _number;
    }

    public void set_number(String _number) {
        this._number = _number;
    }

    public int get_baseTaxes() {
        return _baseTaxes;
    }

    public void set_baseTaxes(int _baseTaxes) {
        this._baseTaxes = _baseTaxes;
    }

    public String get_model() {
        return _model;
    }

    public void set_model(String _model) {
        this._model = _model;
    }
}
