package AbstractFactoryDesignPattern.AbstractFactories;

import AbstractFactoryDesignPattern.Students.Students;
import AbstractFactoryDesignPattern.Students.BS.Arts;
import AbstractFactoryDesignPattern.Students.BS.CS;
import AbstractFactoryDesignPattern.Students.BS.Engineering;

public class BSFactory implements AbstractFactory {
    
    public Students getScore(String obj)
    {
        if(obj=="ARTS")
        {
            return new Arts();
        }
        else if(obj=="CS")
        {
            return new CS();
        }
        else if(obj=="ENGINEERING")
        {
            return new Engineering();
        }

        return null;
    }
}
