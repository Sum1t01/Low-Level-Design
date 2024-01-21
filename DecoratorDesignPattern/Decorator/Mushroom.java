package Decorator;
public class Mushroom implements Decorator{
    Decorator obj;

    public Mushroom(Decorator obj)
    {
        this.obj = obj;
    }

    public int price()
    {
        return 30 + obj.price();
    }
}
