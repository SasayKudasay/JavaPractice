package Task2.Task2_1;

import java.util.Arrays;

public class Picture {
    private String _name;
    private short _year;
    private String _author;
    private String _theme;
    private String _category;
    private String[] _colors;
    private Size _size;
    private boolean _isWithFrames;
    private String _canvas;

    public Picture() {
    }

    public Picture(String _name, short _year, String _author,
                   String _theme, String _category, String[] _colors,
                   Size _size, boolean _isWithFrames, String _canvas) {
        this._name = _name;
        this._year = _year;
        this._author = _author;
        this._theme = _theme;
        this._category = _category;
        this._colors = _colors;
        this._size = _size;
        this._isWithFrames = _isWithFrames;
        this._canvas = _canvas;
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

    public String get_author() {
        return _author;
    }

    public void set_author(String _author) {
        this._author = _author;
    }

    public String get_theme() {
        return _theme;
    }

    public void set_theme(String _theme) {
        this._theme = _theme;
    }

    public String get_category() {
        return _category;
    }

    public void set_category(String _category) {
        this._category = _category;
    }

    public String[] get_colors() {
        return _colors;
    }

    public void set_colors(String[] _colors) {
        this._colors = _colors;
    }

    public Size get_size() {
        return _size;
    }

    public void set_size(Size _size) {
        this._size = _size;
    }

    public boolean is_isWithFrames() {
        return _isWithFrames;
    }

    public void set_isWithFrames(boolean _isWithFrames) {
        this._isWithFrames = _isWithFrames;
    }

    public String get_canvas() {
        return _canvas;
    }

    public void set_canvas(String _canvas) {
        this._canvas = _canvas;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "_name='" + _name + '\'' +
                ", _year=" + _year +
                ", _author='" + _author + '\'' + '\n' +
                ", _theme='" + _theme + '\'' +
                ", _category='" + _category + '\'' +
                ", _colors=" + Arrays.toString(_colors) + '\n' +
                ", _size=" + _size +  '\n' +
                ", _isWithFrames=" + _isWithFrames +
                ", _canvas='" + _canvas + '\'' +
                '}';
    }
}
