package Task5.Task5_2;

public class RegistrationCheckHandler extends VehicleRegistrationHandler{
    @Override
    public void handle(TransportInfo transportInfo) {
        System.out.println("Транспортний засіб успішно зареєстровано!");
    }
}
