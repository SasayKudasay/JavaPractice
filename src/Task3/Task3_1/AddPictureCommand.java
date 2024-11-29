package Task3.Task3_1;

public class AddPictureCommand extends AbstractCommand {

    private Picture _picture;
    private String _placeAt;
    private Gallery _gallery;


    public AddPictureCommand(Picture _picture, String _placeAt, Gallery _gallery) {
        this._picture = _picture;
        this._placeAt = _placeAt;
        this._gallery = _gallery;
    }

    @Override
    public void execute() {
        System.out.println(_picture + " була розташована " + _placeAt);
        _gallery.addPicture(_picture);
    }

    @Override
    public void undo() {
        System.out.println(_picture + " прибрана");
        _gallery.removePicture(_picture);
    }
}
