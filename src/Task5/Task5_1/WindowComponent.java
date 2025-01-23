package Task5.Task5_1;

import java.util.ArrayList;

public abstract class WindowComponent {
    protected String name;
    protected ArrayList<WindowComponent> nestedComponent;

    public void draw(){

        if(!nestedComponent.isEmpty()) {
            for (WindowComponent elem :
                    nestedComponent) {
                elem.draw();
            }
        }
    }

    public void addComponent(WindowComponent component){
        nestedComponent.add(component);
    }

    public void removeComponent(String name){
        for (WindowComponent elem:
             nestedComponent) {
            if(elem.name.equals(name)){
                nestedComponent.remove(elem);
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
