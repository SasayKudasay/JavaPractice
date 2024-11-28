package Task2.Task2_2;

public class Transport {
    private String _type;
    private String _model;
    private int _year;
    private int _capacity;
    private int _speed;
    private String _brand;
    private String _fuelType;
    private int _carID;
    private int _weight;
    private int _height;
    private int _width;

    public Transport() {
    }

    public Transport(String _type, String _model, int _year,
                     int _capacity, int _speed, String _brand,
                     String _fuelType, int _carID,
                     int _weight, int _height, int _width) {
        this._type = _type;
        this._model = _model;
        this._year = _year;
        this._capacity = _capacity;
        this._speed = _speed;
        this._brand = _brand;
        this._fuelType = _fuelType;
        this._carID = _carID;
        this._weight = _weight;
        this._height = _height;
        this._width = _width;
    }

    public String get_type() {
        return _type;
    }

    public void set_type(String _type) {
        this._type = _type;
    }

    public String get_model() {
        return _model;
    }

    public void set_model(String _model) {
        this._model = _model;
    }

    public int get_year() {
        return _year;
    }

    public void set_year(int _year) {
        this._year = _year;
    }

    public int get_capacity() {
        return _capacity;
    }

    public void set_capacity(int _capacity) {
        this._capacity = _capacity;
    }

    public int get_speed() {
        return _speed;
    }

    public void set_speed(int _speed) {
        this._speed = _speed;
    }

    public String get_brand() {
        return _brand;
    }

    public void set_brand(String _brand) {
        this._brand = _brand;
    }

    public String get_fuelType() {
        return _fuelType;
    }

    public void set_fuelType(String _fuelType) {
        this._fuelType = _fuelType;
    }

    public int get_carID() {
        return _carID;
    }

    public void set_carID(int _carID) {
        this._carID = _carID;
    }

    public int get_weight() {
        return _weight;
    }

    public void set_weight(int _weight) {
        this._weight = _weight;
    }

    public int get_height() {
        return _height;
    }

    public void set_height(int _height) {
        this._height = _height;
    }

    public int get_width() {
        return _width;
    }

    public void set_width(int _width) {
        this._width = _width;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "_type='" + _type + '\'' + '\n' +
                ", _model='" + _model + '\'' +
                ", _year=" + _year +
                ", _capacity=" + _capacity + '\n' +
                ", _speed=" + _speed +
                ", _brand='" + _brand + '\'' +
                ", _fuelType='" + _fuelType + '\'' + '\n' +
                ", _carID=" + _carID +
                ", _weight=" + _weight + '\n' +
                ", _height=" + _height +
                ", _width=" + _width +
                '}';
    }
}
