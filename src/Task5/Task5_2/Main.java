package Task5.Task5_2;

public class Main {
    static public void main(String[] args){
        TransportInfo vehicle = new TransportInfo(true, false, 4);

        DocumentCheckHandler documentCheck = new DocumentCheckHandler();
        FineCheckHandler fineCheck = new FineCheckHandler();
        EmissionCheckHandler emissionCheck = new EmissionCheckHandler();
        RegistrationCheckHandler registration = new RegistrationCheckHandler();

        documentCheck.addHandler(fineCheck);
        fineCheck.addHandler(emissionCheck);
        emissionCheck.addHandler(registration);

        documentCheck.handle(vehicle);
    }
}
