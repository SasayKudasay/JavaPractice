package Task1;

import java.util.ArrayList;
import java.util.HashMap;

public class Gallery {
    private ArrayList<Picture> pictures = new ArrayList<>();
    private String name;
    private String article;
    private static HashMap<String, Gallery> instance = new HashMap<>();

    private Gallery(String name) {
        this.name = name;
    }

    public static Gallery getInstance(String name) {
        if(!instance.containsKey(name)){
            instance.put(name, new Gallery(name));
        }
        return instance.get(name);
    }

    public boolean addPicture(Picture picture){
        return pictures.add(picture);
    }

    public boolean removePicture(Picture picture){
        return pictures.remove(picture);
    }

    public String describePicture(Picture picture){
        return "Ця картина має такі дані: " + picture.toString();
    }

    public Picture getPicture(Picture picture){
        for (Picture p:
             pictures) {
            if(p.equals(picture)){
                return  p;
            }
        }
        return null;
    }

    public ArrayList<Picture> getPictures(){
        return pictures;
    }

    public long getPictureCount(){
        return pictures.size();
    }

    public String getName() {
        return name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }
}
