package Decorator;
public class Cheese implements Decorator{
    Decorator obj;

    public Cheese(Decorator obj)
    {
        this.obj = obj;
    }

    public int price()
    {
        return 50 + obj.price();
    }
}
