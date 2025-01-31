package Task7.Task7_2;

public class Transport {
    private  String number;
    private boolean status;
    private boolean diesel;
    private int weight;

    public Transport(String number, boolean status, boolean diesel, int weight) {
        this.number = number;
        this.status = status;
        this.diesel = diesel;
        this.weight = weight;
    }

    public int getRegistrationFee(){
        return 1000;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "number='" + number + '\'' +
                ", status=" + status +
                ", diesel=" + diesel +
                ", weight=" + weight +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isDiesel() {
        return diesel;
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
