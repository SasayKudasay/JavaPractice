package Task3.Task3_1;

import Task3.Task3_1.AbstractCommand;
import Task3.Task3_1.Gallery;
import Task3.Task3_1.Picture;

public class RemovePictureCommand extends AbstractCommand {

    private Picture _picture;
    private Gallery _gallery;

    public RemovePictureCommand(Picture _picture, Gallery _gallery) {
        this._picture = _picture;
        this._gallery = _gallery;
    }

    @Override
    public void execute() {
        System.out.println(_picture + " була видалена з колекції");
        _gallery.removePicture(_picture);
    }

    @Override
    public void undo() {
        System.out.println(_picture + " була повернута до колекції");
        _gallery.addPicture(_picture);
    }
}
