package AbstractFactoryDesignPattern.AbstractFactories;

import AbstractFactoryDesignPattern.Students.Students;
import AbstractFactoryDesignPattern.Students.MS.MSc;
import AbstractFactoryDesignPattern.Students.MS.MBA;

public class MSFactory implements AbstractFactory{
    public Students getScore(String obj)
    {
        if(obj=="MSC")
        {
            return new MSc();
        }
        else if(obj=="MBA")
        {
            return new MBA();
        }

        return null;
    }
}
