package StrategyDesignPattern.Vehicles;

import StrategyDesignPattern.Strategies.DriveStrategy;

public class SportsCar extends vehicle{
    SportsCar(DriveStrategy obj)
    {
        super(obj);
    }
}
