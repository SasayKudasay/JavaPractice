package Task7.Task7_2;

public abstract class AbstractHandlerDecorator implements IHandlerDecorator{
    IHandlerDecorator decorated;

    public AbstractHandlerDecorator(IHandlerDecorator decorator) {
        this.decorated = decorator;
    }

    public  String getDescription(Transport transport){
        if(decorated != null){
            return decorated.getDescription(transport);
        }
        return transport.toString() + " ";
    };

    public  int getRegistrationFee(Transport transport){
        if (decorated != null){
            return decorated.getRegistrationFee(transport);
        }
        return transport.getRegistrationFee();
    };
}
