package FactoryDesignPattern;

import FactoryDesignPattern.Factory.Factory;
import FactoryDesignPattern.Shapes.baseShape;

public class Main {
    public static void main(String args[])
    {
        Factory f1 = new Factory();
        baseShape b = f1.getShape("SQUARE");
        b.draw();
    }
}
