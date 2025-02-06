package Task9.Task9_2;

public class User {
    private String _firstName;
    private String _lastName;
    private boolean _isAdmin;

    public User(String _firstName, String _lastName, boolean _isAdmin) {
        this._firstName = _firstName;
        this._lastName = _lastName;
        this._isAdmin = _isAdmin;
    }

    @Override
    public String toString() {
        return "User{" +
                "_firstName='" + _firstName + '\'' +
                ", _lastName='" + _lastName + '\'' +
                ", _isAdmin=" + _isAdmin +
                '}';
    }

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }

    public boolean is_isAdmin() {
        return _isAdmin;
    }

    public void set_isAdmin(boolean _isAdmin) {
        this._isAdmin = _isAdmin;
    }
}
