package Task6.Task6_2;

public class Transport {
    private String type;
    private double value;


    public Transport(String type, double value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }



    @Override
    public String toString() {
        return "Transport{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
