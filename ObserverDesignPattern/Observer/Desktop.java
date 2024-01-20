package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.Observable;

public class Desktop implements Observer {
    Observable obj;
    int id;

    public Desktop(Observable obj, int id)
    {
        this.obj = obj;
        this.id = id;
    }
    
    public void receive_update()
    {
        System.out.println("Desktop " + id + " updated its temperature to " + obj.syncUpdate());
    }
}
