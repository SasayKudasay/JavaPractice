package Task7.Task7_2;

public class Main {
    public static void main(String[] args) {
        Transport transport = new Transport("AAA", true, false, 4000);
        Transport transport1 = new Transport("BBB", true, true, 1000);

        IHandlerDecorator decorator = new DieselHandlerDecorator(null);
        decorator = new RegistrationDecorator(decorator);
        decorator = new WeightDecorator(decorator);
        decorator = new NumberDecorator(decorator);

        TransportRegistry registry = new TransportRegistry(decorator);
        registry.addTransport(transport);
        registry.addTransport(transport1);
        registry.handle();
    }
}
