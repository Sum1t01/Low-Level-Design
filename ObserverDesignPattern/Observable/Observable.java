package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.Observer;

/**
 * ObservableInterface
 */
public interface Observable {

    void add(Observer obj);
    void remove(Observer obj);
    void update(int temp);
    void notification();
    int syncUpdate();
}
