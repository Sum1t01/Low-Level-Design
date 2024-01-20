package StrategyDesignPattern.Vehicles;

import StrategyDesignPattern.Strategies.DriveStrategy;

public class NormalCar extends vehicle{
    public NormalCar(DriveStrategy obj)
    {
        super(obj);
    }
}
