package Task1.Task1_1;

public class Main {
    public static void main(String[] args) {

        Picture picture1 = new Picture("Чорний квадрат", (short) 1890, "Malevich");
        Picture picture2 = new Picture("A1",(short) 1990,"Author");
        Picture picture3 = new Picture("C3", (short) 2020, "DODO");

        Gallery gallery = Gallery.getInstance("Галерея");
        gallery.addPicture(picture1);
        gallery.addPicture(picture2);
        gallery.addPicture(picture3);

        for (Picture picture:
                gallery.get_pictures()) {
            System.out.println(picture);
        }

        System.out.println();
        gallery.removePicture(picture2);
        for (Picture picture:
                gallery.get_pictures()) {
            System.out.println(picture);
        }

        System.out.println();

        gallery.set_article("Ця галерея присвячена новому року");
        System.out.println(
                gallery.getPicture(picture1) + "\n" +
                gallery.get_name() + "\n" +
                gallery.get_article()+ "\n" +
                gallery.getPictureCount() + "\n" +
                gallery.describePicture(picture1)
        );

    }
}