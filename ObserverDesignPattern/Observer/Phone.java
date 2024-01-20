package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.Observable;

public class Phone implements Observer {
    Observable obj;
    int id;

    public Phone(Observable obj, int id)
    {
        this.obj = obj;
        this.id = id;
    }
    
    public void receive_update()
    {
        System.out.println("Phone " + id + " updated its temperature to " + obj.getTemp());
    }

}
