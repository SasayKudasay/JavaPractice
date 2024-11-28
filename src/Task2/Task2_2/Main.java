package Task2.Task2_2;

public class Main {
    public static void main(String[] args) {
        TransportBuilder tb1 = new TransportBuilder();
        tb1.setBasicParams("Car", "E4", 1999);
        tb1.setTechParams(4, 120, "Diesel");
        tb1.setInformParams("Mersedes", 24242);

        Transport t1 = tb1.build();
        System.out.println(t1);

        TransportBuilder tb2 = new TransportBuilder();
        tb2.setSizeParams(1000, 2, 3);
        tb2.setInformParams("Audi", 93493);

        Transport t2 = tb2.build();
        System.out.println(t2);
    }
}
