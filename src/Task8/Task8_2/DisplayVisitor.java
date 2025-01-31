package Task8.Task8_2;

public class DisplayVisitor implements TransportVisitor{
    @Override
    public void visitCar(Car car) {
        System.out.println("Автомобіль: " + car.getModel() + ", Рік: " + car.getYear());
    }

    @Override
    public void visitTruck(Truck truck) {
        System.out.println("Вантажівка: " + truck.getModel() + ", Вантажопідйомність: " + truck.getLoadCapacity() + " кг");
    }
}
