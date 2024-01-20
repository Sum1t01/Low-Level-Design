package StrategyDesignPattern.Strategies;

public class CasualDrive implements DriveStrategy {
    public void drive()
    {
        System.out.println("Go easy!");
    }    
}
