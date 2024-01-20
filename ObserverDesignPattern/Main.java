package ObserverDesignPattern;

import ObserverDesignPattern.Observable.Observable;
import ObserverDesignPattern.Observable.WeatherStation;
import ObserverDesignPattern.Observer.Desktop;
import ObserverDesignPattern.Observer.Observer;
import ObserverDesignPattern.Observer.Phone;

public class Main {
    public static void main(String args[])
    {
        Observable weather = new WeatherStation();
        Observer p1 = new Phone(weather, 1);
        Observer p2 = new Phone(weather, 2);
        Observer p3 = new Phone(weather, 3);
        Observer p4 = new Phone(weather, 4);

        Observer d1 = new Desktop(weather, 1);
        Observer d2 = new Desktop(weather, 2);
        Observer d3 = new Desktop(weather, 3);
        Observer d4 = new Desktop(weather, 4);


        weather.add(p1);
        weather.add(p2);
        weather.add(p3);
        weather.add(p4);

        weather.add(d1);
        weather.add(d2);
        weather.add(d3);
        weather.add(d4);

        weather.update(23);
        weather.remove(d1);
        weather.update(24);
        weather.update(24);
    }
}
