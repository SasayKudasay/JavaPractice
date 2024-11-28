package Task3;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gallery gallery = Gallery.getInstance("MyGallery");
        GalleryController galleryController = new GalleryController();

        Picture picture1 = new Picture("Чорний квадрат", (short) 1890, "Malevich");
        Picture picture2 = new Picture("A1",(short) 1990,"Author");
        Picture picture3 = new Picture("C3", (short) 2020, "DODO");

        AbstractCommand addCommand1 = new AddPictureCommand(picture1, "Головний зал", gallery);
        AbstractCommand addCommand2 = new AddPictureCommand(picture2, "Ліво крило", gallery);
        AbstractCommand addCommand3 = new AddPictureCommand(picture3, "Праве крило", gallery);

        AbstractCommand removeCommand1 = new RemovePictureCommand(picture1, gallery);
        AbstractCommand removeCommand2 = new RemovePictureCommand(picture2, gallery);
        AbstractCommand removeCommand3 = new RemovePictureCommand(picture3, gallery);

        AbstractCommand closeCommand1 = new ClosePictureCommand(picture1, "10.02.2024");
        AbstractCommand closeCommand2 = new ClosePictureCommand(picture2, "19.09.2022");
        AbstractCommand closeCommand3 = new ClosePictureCommand(picture3, "07.12.2023");

        galleryController.addCommand(addCommand1);
        galleryController.executeCommand();
        galleryController.addCommand(addCommand2);
        galleryController.executeCommand();
        galleryController.addCommand(addCommand3);
        galleryController.executeCommand();

        System.out.println();

        galleryController.undoCommand(addCommand2);


    }
}
