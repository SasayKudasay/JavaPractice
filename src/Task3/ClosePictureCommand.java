package Task3;

public class ClosePictureCommand extends AbstractCommand{

    private Picture _picture;
    private String _time;

    public ClosePictureCommand(Picture _picture, String _time) {
        this._picture = _picture;
        this._time = _time;
    }

    @Override
    public void execute() {
        System.out.println(_picture + " була забрана на реставрацію у " + _time);
    }

    @Override
    public void undo() {
        System.out.println(_picture + "повернута до колекції");
    }
}
