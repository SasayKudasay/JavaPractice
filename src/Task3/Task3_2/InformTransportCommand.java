package Task3.Task3_2;

public class InformTransportCommand extends AbstractCommand{
    private Transport _transport;

    public InformTransportCommand(Transport _transport) {
        this._transport = _transport;
    }

    @Override
    public void execute() {
        System.out.println("Цей транспорт має назв: " + _transport.get_name());
        System.out.println("Має таке айди: " + _transport.get_carID());
        System.out.println("Має такий рік випуску: " + _transport.get_year());
    }

    @Override
    public void undo() {
        System.out.println("Усі дії скасовано");
    }
}
