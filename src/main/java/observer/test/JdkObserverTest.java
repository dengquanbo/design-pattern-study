package observer.test;

import java.util.Observer;

import observer.jdkobserver.Watched;
import observer.jdkobserver.Watcher;

public class JdkObserverTest {

    public static void main(String[] args) {
        Watched watched = new Watched();
        Observer observer = new Watcher();
        watched.addObserver(observer);
        watched.changeData("first");
        watched.changeData("second");
        watched.changeData("third");
        watched.changeData("fourth");
    }
}