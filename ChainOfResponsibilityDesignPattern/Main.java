package ChainOfResponsibilityDesignPattern;

import ChainOfResponsibilityDesignPattern.Currency.*;

public class Main {
    public static void main(String args[])
    {
        Currency atm = new Currency2000(new Currency1000(new Currency500(null, 100), 100), 10);
        atm.operation(5500);
    }
}
