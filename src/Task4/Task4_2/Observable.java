package Task4.Task4_2;

import java.util.ArrayList;

public abstract class Observable {
    private ArrayList<Observer> arrayList = new ArrayList<>();

    public Observable() {
    }

    public void subscribe(Observer observer){
        arrayList.add(observer);
    }

    public void unsubscribe(Observer observer){
        arrayList.remove(observer);
    }

    public void myNotify(Vehicle vehicle){
        for (Observer o:
             arrayList) {
            o.myNotify(vehicle);
        }
    }
}
