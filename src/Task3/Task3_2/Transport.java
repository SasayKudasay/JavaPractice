package Task3.Task3_2;

public class Transport {
    private String _name;
    private int _year;
    private int _carID;

    public Transport(String _name, int _year, int _carID) {
        this._name = _name;
        this._year = _year;
        this._carID = _carID;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int get_year() {
        return _year;
    }

    public void set_year(int _year) {
        this._year = _year;
    }

    public int get_carID() {
        return _carID;
    }

    public void set_carID(int _carID) {
        this._carID = _carID;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "_name='" + _name + '\'' +
                ", _year=" + _year +
                ", _carID=" + _carID +
                '}';
    }
}
