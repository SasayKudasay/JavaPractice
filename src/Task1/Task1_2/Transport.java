package Task1.Task1_2;

public class Transport {
    private String _name;
    private short _year;
    private short _VehicleID;
    private String _model;

    public Transport(String _name, short _year, short _VehicleID, String _model) {
        this._name = _name;
        this._year = _year;
        this._VehicleID = _VehicleID;
        this._model = _model;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public short get_year() {
        return _year;
    }

    public void set_year(short _year) {
        this._year = _year;
    }

    public short get_VehicleID() {
        return _VehicleID;
    }

    public void set_VehicleID(short _VehicleID) {
        this._VehicleID = _VehicleID;
    }

    public String get_model() {
        return _model;
    }

    public void set_model(String _model) {
        this._model = _model;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "_name='" + _name + '\'' +
                ", _year=" + _year +
                ", _VehicleID=" + _VehicleID +
                ", _model='" + _model + '\'' +
                '}';
    }
}
