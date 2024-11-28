package Task2.Task2_2;

public class TransportBuilder {
    private Transport transport;

    public TransportBuilder() {
        this.transport = new Transport();
    }

    public void setBasicParams(String type, String model, int year){
        transport.set_type(type);
        transport.set_model(model);
        transport.set_year(year);
    }

    public void setTechParams(int capacity, int speed, String fuelType){
        transport.set_capacity(capacity);
        transport.set_fuelType(fuelType);
        transport.set_speed(speed);
    }

    public void setInformParams(String brand, int carID){
        transport.set_carID(carID);
        transport.set_brand(brand);
    }

    public void setSizeParams(int weight, int height, int width){
        transport.set_weight(weight);
        transport.set_width(width);
        transport.set_height(height);
    }

    public Transport build(){
        return transport;
    }
}
