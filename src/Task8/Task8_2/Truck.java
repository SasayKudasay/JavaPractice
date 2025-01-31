package Task8.Task8_2;

public class Truck extends Transport{
    private int loadCapacity;

    public Truck(String model, int loadCapacity) {
        super(model);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void accept(TransportVisitor visitor) {
        visitor.visitTruck(this);
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
