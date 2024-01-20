package StrategyDesignPattern;

import StrategyDesignPattern.Strategies.CasualDrive;
import StrategyDesignPattern.Vehicles.NormalCar;
import StrategyDesignPattern.Vehicles.vehicle;

public class Main
{
    public static void main(String args[])
    {
        vehicle v = new NormalCar(new CasualDrive());
        v.drive();
    }
}