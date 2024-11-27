package Task2.Task2_1;

public class Size {
    private short _height;
    private short _width;

    public Size(short _height, short _width) {
        this._height = _height;
        this._width = _width;
    }

    public short get_height() {
        return _height;
    }

    public void set_height(short _height) {
        this._height = _height;
    }

    public short get_width() {
        return _width;
    }

    public void set_width(short _width) {
        this._width = _width;
    }

    @Override
    public String toString() {
        return "Size{" +
                "_height=" + _height +
                ", _width=" + _width +
                '}';
    }
}
