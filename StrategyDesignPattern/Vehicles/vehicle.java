package StrategyDesignPattern.Vehicles;

import StrategyDesignPattern.Strategies.DriveStrategy;

public class vehicle {
    DriveStrategy obj;

    public vehicle(DriveStrategy obj)
    {
        this.obj = obj;
    }

    public void drive()
    {
        obj.drive();
    }
}
