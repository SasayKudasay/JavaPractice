package Task4.Task4_1.Notifiers;

import Task4.Task4_1.Observer;
import Task4.Task4_1.SystemAlert;

public class PhoneNotifer implements Observer {
    public String _phoneNumber;

    public PhoneNotifer(String _phoneNumber) {
        this._phoneNumber = _phoneNumber;
    }

    @Override
    public void myNotify(SystemAlert alert) {
        System.out.println("Почався виклик на телефон: " + _phoneNumber + " повідомлення: " + alert);
    }
}
