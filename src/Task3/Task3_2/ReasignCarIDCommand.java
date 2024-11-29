package Task3.Task3_2;

public class ReasignCarIDCommand extends AbstractCommand{
    private Transport _transport;
    private int _carID;
    private int _oldCarID;

    public ReasignCarIDCommand(Transport _transport, int _carID) {
        this._transport = _transport;
        this._carID = _carID;
    }

    @Override
    public void execute() {
        _oldCarID = _transport.get_carID();
        System.out.println("ДО: " + _transport);
        _transport.set_carID(_carID);
        System.out.println("ПІСЛЯ: " + _transport);
    }

    @Override
    public void undo() {
        System.out.println("ID автомобіля повернуто до попереднього значення");
        _transport.set_carID(_oldCarID);
    }
}
