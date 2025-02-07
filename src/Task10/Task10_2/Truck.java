package Task10.Task10_2;

public class Truck extends AbstractTransport {
    private int _capacity;

    public Truck(String _number, int _taxes, String _model, int _capacity) {
        super(_number, _taxes, _model);
        this._capacity = _capacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "_capacity=" + _capacity +
                '}';
    }

    public int get_capacity() {
        return _capacity;
    }

    public void set_capacity(int _capacity) {
        this._capacity = _capacity;
    }
}
