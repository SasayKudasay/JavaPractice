package Task8.Task8_2;

public abstract class Transport {
    private String model;

    public Transport(String model) {
        this.model = model;
    }

    public abstract void accept(TransportVisitor visitor);

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
