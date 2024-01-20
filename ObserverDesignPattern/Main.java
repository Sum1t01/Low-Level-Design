package ObserverDesignPattern;

import ObserverDesignPattern.Observable.Observable;
import ObserverDesignPattern.Observable.WeatherStation;
import ObserverDesignPattern.Observer.Desktop;
import ObserverDesignPattern.Observer.Observer;
import ObserverDesignPattern.Observer.Phone;

public class Main {
    public static void main(String args[])
    {
        Observable ob = new WeatherStation();
        Observer p1 = new Phone(ob, 1);
        Observer p2 = new Phone(ob, 2);
        Observer p3 = new Phone(ob, 3);
        Observer p4 = new Phone(ob, 4);

        Observer d1 = new Desktop(ob, 1);
        Observer d2 = new Desktop(ob, 2);
        Observer d3 = new Desktop(ob, 3);
        Observer d4 = new Desktop(ob, 4);


        ob.add(p1);
        ob.add(p2);
        ob.add(p3);
        ob.add(p4);

        ob.add(d1);
        ob.add(d2);
        ob.add(d3);
        ob.add(d4);

        ob.update(23);
        ob.remove(d1);
        ob.update(24);
    }
}
