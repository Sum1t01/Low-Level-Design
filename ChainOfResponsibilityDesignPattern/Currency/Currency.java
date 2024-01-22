package ChainOfResponsibilityDesignPattern.Currency;

public abstract class Currency {
    public Currency nextCurrency;
    public int val;

    public void operation(int amount)
    {

    }
    public int getAvailableBalance()
    {
        return 0;
    }
}
