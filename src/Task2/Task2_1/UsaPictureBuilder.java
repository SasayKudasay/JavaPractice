package Task2.Task2_1;

import java.util.Arrays;

public class UsaPictureBuilder extends PictureBuilder{
    private Picture _picture;

    public UsaPictureBuilder() {
        this._picture = new Picture();
    }

    @Override
    void setBasicParams(String name, short year, String author) {
        System.out.println("Made in USA");
        _picture.set_author(author);
        _picture.set_name(name);
        _picture.set_year(year);
    }

    @Override
    void setSizeParams(Size size) {
        System.out.println("What is kilometer");
        _picture.set_size(size);
    }

    @Override
    void setColorsParams(String[] colors, boolean withFrames, String canvas) {
        _picture.set_isWithFrames(withFrames);
        _picture.set_canvas(canvas);
        System.out.println(Arrays.toString(colors));
        _picture.set_colors(colors);
    }

    @Override
    void setCategoryParams(String theme, String category) {
        _picture.set_category(category);
        _picture.set_theme(theme);
    }

    @Override
    Picture build() {
        return _picture;
    }
}
