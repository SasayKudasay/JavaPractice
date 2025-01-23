package Task5.Task5_2;

public class EmissionCheckHandler extends RegistrationCheckHandler{

    public void handle(TransportInfo transportInfo){
        if (transportInfo.getEmissionLevel() > 5) {
            System.out.println("Не відповідає екологічним нормам.");
        }else System.out.println("Екологічні норми виконані.");

        super.handle(transportInfo);
    }
}
