package Task4.Task4_2;

public class Vehicle {
    private String _vehicleNumber;
    private boolean _status;

    public Vehicle(String _vehicle, boolean _status) {
        this._vehicleNumber = _vehicle;
        this._status = _status;
    }

    public String getVehicleNumber() {
        return _vehicleNumber;
    }

    public void setVehicleNumber(String _vehicleNumber) {
        this._vehicleNumber = _vehicleNumber;
    }

    public boolean isStatus() {
        return _status;
    }

    public void setStatus(boolean _status) {
        this._status = _status;
    }
}
