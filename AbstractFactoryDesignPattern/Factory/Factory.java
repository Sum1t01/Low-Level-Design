package AbstractFactoryDesignPattern.Factory;

import AbstractFactoryDesignPattern.AbstractFactories.AbstractFactory;
import AbstractFactoryDesignPattern.AbstractFactories.BSFactory;
import AbstractFactoryDesignPattern.AbstractFactories.MSFactory;
import AbstractFactoryDesignPattern.Students.Students;

public class Factory {
    AbstractFactory f;
    public Students getStudents(String level, String specialization)
    {
        if(level=="BS")
        {
            f = new BSFactory();
            return f.getScore(specialization);
        }
        else if(level=="MS")
        {
            f = new MSFactory();
            return f.getScore(specialization);
        }

        return null;
    }
}
