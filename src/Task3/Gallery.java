package Task3;



import java.util.ArrayList;
import java.util.HashMap;

public class Gallery {
    private ArrayList<Picture> _pictures = new ArrayList<>();
    private String _name;
    private String _article;
    private static HashMap<String, Gallery> _instance = new HashMap<>();

    private Gallery(String name) {
        this._name = name;
    }

    public static Gallery getInstance(String name) {
        if(!_instance.containsKey(name)){
            _instance.put(name, new Gallery(name));
        }
        return _instance.get(name);
    }

    public boolean addPicture(Picture picture){
        return _pictures.add(picture);
    }

    public boolean removePicture(Picture picture){
        return _pictures.remove(picture);
    }

    public String describePicture(Picture picture){
        return "Ця картина має такі дані: " + picture.toString();
    }

    public Picture getPicture(String name){
        for (Picture p:
                _pictures) {
            if(p.get_name().equals(name)){
                return  p;
            }
        }
        return null;
    }

    public ArrayList<Picture> get_pictures(){
        return _pictures;
    }

    public long getPictureCount(){
        return _pictures.size();
    }

    public String get_name() {
        return _name;
    }

    public String get_article() {
        return _article;
    }

    public void set_article(String _article) {
        this._article = _article;
    }
}
