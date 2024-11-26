package Task1;

import Task1.Gallery;

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
                gallery.getPictures()) {
            System.out.println(picture);
        }

        System.out.println();
        gallery.removePicture(picture2);
        for (Picture picture:
                gallery.getPictures()) {
            System.out.println(picture);
        }

        System.out.println();

        gallery.setArticle("Ця галерея присвячена новому року");
        System.out.println(
                gallery.getPicture(picture1) + "\n" +
                gallery.getName() + "\n" +
                gallery.getArticle()+ "\n" +
                gallery.getPictureCount() + "\n" +
                gallery.describePicture(picture1)
        );

    }
}