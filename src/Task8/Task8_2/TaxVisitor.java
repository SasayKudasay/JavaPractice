package Task8.Task8_2;

public class TaxVisitor implements TransportVisitor{
    @Override
    public void visitCar(Car car) {
        System.out.println("Податок на автомобіль " + car.getModel() + ": " + (car.getYear() * 10));
    }

    @Override
    public void visitTruck(Truck truck) {
        System.out.println("Податок на вантажівку " + truck.getModel() + ": " + (truck.getLoadCapacity() * 0.5) );
    }
}
