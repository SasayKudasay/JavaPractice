package Task1;

import java.util.Objects;

public class Picture {
    private String name;
    private short year;
    private String author;

    public Picture(String name, short year, String author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public short getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Task1.Picture{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Picture picture = (Picture) o;
        return year == picture.year && Objects.equals(name, picture.name) && Objects.equals(author, picture.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, author);
    }
}
