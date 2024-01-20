
package ObserverDesignPattern.Observable;

import java.util.*;

import ObserverDesignPattern.Observer.Observer;

public class WeatherStation implements Observable {
    public int curr_temp = 0;
    List<Observer> l = new ArrayList<Observer>();

    public void add(Observer obj)
    {
        l.add(obj);
    }

    public void remove(Observer obj)
    {
        l.remove(obj);
    }

    public void update(int new_temp)
    {
        if(new_temp != curr_temp)
        {
            curr_temp = new_temp;
            notification();
        }
    }

  
    public void notification() {

        for(Observer x: l)
        {
            x.receive_update();
        }
    }

    public int getTemp()
    {
        return curr_temp;
    }
}
