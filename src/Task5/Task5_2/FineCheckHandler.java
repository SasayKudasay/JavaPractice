package Task5.Task5_2;

public class FineCheckHandler extends VehicleRegistrationHandler{
    @Override
    public void handle(TransportInfo transportInfo) {
        if (transportInfo.isHasFine()) {
            System.out.println("Є непогашенні штрафи");
        } else System.out.println("Штрафів нема");

        super.handle(transportInfo);
    }
}
