package Task2.Task2_1;

public class UkrainePictureBuilder extends PictureBuilder{
    private Picture _picture;

    public UkrainePictureBuilder() {
        this._picture = new Picture();
    }

    @Override
    void setBasicParams(String name, short year, String author) {
        System.out.println("Made in UA");
        _picture.set_name(name);
        System.out.println(author + " наш живчик");
        _picture.set_year(year);
        _picture.set_author(author);
    }

    @Override
    void setSizeParams(Size size) {
        _picture.set_size(size);
    }

    @Override
    void setColorsParams(String[] colors, boolean withFrames, String canvas) {
        _picture.set_colors(colors);
        _picture.set_isWithFrames(withFrames);
        _picture.set_canvas(canvas);
    }

    @Override
    void setCategoryParams(String theme, String category) {
        _picture.set_theme(theme);
        _picture.set_category(category);
    }

    @Override
    Picture build() {
        return _picture;
    }
}
