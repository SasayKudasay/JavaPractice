package Task8.Task8_2;

public class Car extends Transport{
    private int year;

    public Car(String model, int year) {
        super(model);
        this.year = year;
    }

    @Override
    public void accept(TransportVisitor visitor) {
        visitor.visitCar(this);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
