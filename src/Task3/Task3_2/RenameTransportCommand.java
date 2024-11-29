package Task3.Task3_2;

public class RenameTransportCommand extends AbstractCommand{
    private Transport _transport;
    private String _name;
    private String _oldName;

    public RenameTransportCommand(Transport _transport, String _name) {
        this._transport = _transport;
        this._name = _name;
    }

    @Override
    public void execute() {
        _oldName = _transport.get_name();
        System.out.println("ДО: " + _transport);
        _transport.set_name(_name);
        System.out.println("ПІСЛЯ: " + _transport);
    }

    @Override
    public void undo() {
        System.out.println("Ім'я повернуто до попереднього значення");
        _transport.set_name(_oldName);
    }
}
