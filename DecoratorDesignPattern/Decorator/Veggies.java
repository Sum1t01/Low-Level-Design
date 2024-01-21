package Decorator;

public class Veggies implements Decorator{
    Decorator obj;

    public Veggies(Decorator obj)
    {
        this.obj = obj;
    }

    public int price()
    {
        return 30 + obj.price();
    }
}
