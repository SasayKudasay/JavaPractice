package Task2.Task2_1;

abstract public class PictureBuilder {
    private Picture _picture;

    public PictureBuilder() {
        this._picture = new Picture();
    }

    abstract void setBasicParams(String name, short year, String author);
    abstract void setSizeParams(Size size);
    abstract void setColorsParams(String[] colors, boolean withFrames, String canvas);
    abstract void setCategoryParams(String theme, String category);

    abstract Picture build();
}
