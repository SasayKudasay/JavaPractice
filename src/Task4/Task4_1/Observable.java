package Task4.Task4_1;

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

    public void myNotify(SystemAlert alert){
        for (Observer o:
             arrayList) {
            o.myNotify(alert);
        }
    }
}
