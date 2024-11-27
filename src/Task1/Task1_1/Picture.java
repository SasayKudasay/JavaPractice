package Task1.Task1_1;

import java.util.Objects;

public class Picture {
    private String _name;
    private short _year;
    private String _author;

    public Picture(String name, short year, String author) {
        this._name = name;
        this._year = year;
        this._author = author;
    }

    public String get_name() {
        return _name;
    }

    public short get_year() {
        return _year;
    }

    public String get_author() {
        return _author;
    }

    @Override
    public String toString() {
        return "Task1.Task1_1.Picture{" +
                "name='" + _name + '\'' +
                ", year=" + _year +
                ", author='" + _author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Picture picture = (Picture) o;
        return _year == picture._year && Objects.equals(_name, picture._name) && Objects.equals(_author, picture._author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_name, _year, _author);
    }
}
