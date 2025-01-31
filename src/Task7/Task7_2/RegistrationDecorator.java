package Task7.Task7_2;

public class RegistrationDecorator extends AbstractHandlerDecorator{
    public RegistrationDecorator(IHandlerDecorator decorator) {
        super(decorator);
    }

    @Override
    public String getDescription(Transport transport) {
        return super.getDescription(transport) + " (Статус: " + (transport.isStatus() ? "активний" : "неактивний") + ")";
    }

    @Override
    public int getRegistrationFee(Transport transport) {
        return super.getRegistrationFee(transport);
    }
}
