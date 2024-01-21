package FactoryDesignPattern.Factory;

import FactoryDesignPattern.Shapes.Circle;
import FactoryDesignPattern.Shapes.Rectangle;
import FactoryDesignPattern.Shapes.Square;
import FactoryDesignPattern.Shapes.baseShape;

public class Factory {
    
    public baseShape getShape(String shape)
    {
        if(shape=="CIRCLE")
        {
            return new Circle();
        }
        else if(shape=="RECTANGLE")
        {
            return new Rectangle();
        }
        else if(shape=="SQUARE")
        {
            return new Square();
        }
        
        return null;
    }
}
