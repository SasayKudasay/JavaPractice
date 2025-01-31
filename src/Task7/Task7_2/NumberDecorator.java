package Task7.Task7_2;

public class NumberDecorator extends AbstractHandlerDecorator{
    public NumberDecorator(IHandlerDecorator decorator) {
        super(decorator);
    }

    @Override
    public String getDescription(Transport transport) {
        return super.getDescription(transport) +
         " (номер: " + transport.getNumber() + ")";
    }

    @Override
    public int getRegistrationFee(Transport transport) {
        return super.getRegistrationFee(transport);
    }
}
