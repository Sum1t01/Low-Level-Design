package StrategyDesignPattern.Vehicles;

import StrategyDesignPattern.Strategies.DriveStrategy;

public class OffRoadCar extends vehicle{
    OffRoadCar(DriveStrategy obj)
    {
        super(obj);
    }
}
