import Decorator.*;


public class Main
{
    public static void main(String args[])
    {
        Decorator pizza = new Cheese(new Cheese(new Cheese(new Mushroom(new VegDelight()))));

        System.out.println(pizza.price());
    }
}