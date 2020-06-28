package observer.jdkobserver;

import java.util.Observable;

/**
 * 具体主题
 */
public class Watched extends Observable {
    private String data = "";

    public void changeData(String data) {
        if (this.data.equals(data)) {
            return;
        }
        this.data = data;
        setChanged();
        notifyObservers(this.data);
    }
}