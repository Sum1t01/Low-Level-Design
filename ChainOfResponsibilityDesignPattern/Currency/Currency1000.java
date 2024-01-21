package ChainOfResponsibilityDesignPattern.Currency;

public class Currency1000 extends Currency{
    public Currency1000(Currency obj, int val)
    {
        this.nextCurrency = obj;
        this.val = val;
    }

    public void operation(int amount)
    {
        if(amount>val*1000)
        {
            if(nextCurrency!=null)
            {
                nextCurrency.operation(amount);
            }
            else
            {
                System.out.println("Insufficient balance!");
                return;
            }
        }
        else
        {
            int denominator = amount/1000;
            int withdrawn_val = denominator*1000;
            val-=withdrawn_val;
            System.out.println(denominator + " 1000 notes issued");
            if(withdrawn_val<amount)
            {
                nextCurrency.operation(amount-withdrawn_val);
            }
        }
    }
}
