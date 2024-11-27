package Task1.Task1_2;

public class Main {
    public static void main(String[] args) {
        Transport t1 = new Transport("A1", (short) 1990, (short) 1111, "Toyota");
        Transport t2 = new Transport("Ammo", (short) 2022, (short) 9999, "Mersedes");
        Transport t3 = new Transport("Kiko", (short) 1984, (short) 8593, "Kia");

        TransportRegistry registry = TransportRegistry.getInstance("MyRegistry");
        registry.addTransport(t1);
        registry.addTransport(t2);
        registry.addTransport(t3);

        for (Transport t:
                registry.getVehicles()) {
            System.out.println(t);
        }

        registry.removeTransport(t1);
        System.out.println();

        for (Transport t:
                registry.getVehicles()) {
            System.out.println(t);
        }

        System.out.println();
        System.out.println(registry.getTransport((short) 9999));
        System.out.println(registry.getTransport((short) 1111));



    }
}
