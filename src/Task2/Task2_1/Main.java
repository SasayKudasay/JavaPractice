package Task2.Task2_1;

public class Main {
    public static void main(String[] args) {
        PictureBuilder pb1 = new UkrainePictureBuilder();
        pb1.setBasicParams("Аboba", (short) 2024, "Oleg");
        pb1.setCategoryParams("Western", "Memes");

        Size size1 = new Size((short) 1000, (short) 600);
        pb1.setSizeParams(size1);
        Picture p1 = pb1.build();

        System.out.println(p1);

        PictureBuilder pb2 = new UsaPictureBuilder();
        pb2.setBasicParams("Apple", (short) 1992, "John Dow");
        String[] colors = new String[]{"Red", "Blue", "Green"};
        pb2.setColorsParams(colors, true, "Paper");
        pb2.setCategoryParams("stillLife", "Nature");

        Picture p2 = pb2.build();
        System.out.println();
        System.out.println(p2);

    }
}