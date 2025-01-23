package Task5.Task5_2;

public class DocumentCheckHandler extends VehicleRegistrationHandler{

    public void handle(TransportInfo transportInfo){
        if (!transportInfo.isDocumentsValid()) {
            System.out.println("Документи неправильні");
        } else System.out.println("Документи в нормі.");

        super.handle(transportInfo);
    }
}
