package Task7.Task7_2;

public class DieselHandlerDecorator extends AbstractHandlerDecorator{
    public DieselHandlerDecorator(IHandlerDecorator decorator) {
        super(decorator);
    }

    @Override
    public String getDescription(Transport transport) {
        return super.getDescription(transport) +
         " (Паливо: " + (transport.isDiesel() ? "Дизель" : "Бензин") + ")";
    }

    @Override
    public int getRegistrationFee(Transport transport) {

        if(transport.isDiesel()){
            return super.getRegistrationFee(transport) + 1500;
        }
        return super.getRegistrationFee(transport) ;

    }
}
