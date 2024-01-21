package ChainOfResponsibilityDesignPattern.Currency;

public class Currency500 extends Currency{
    public Currency500(Currency obj, int val)
    {
        this.nextCurrency = obj;
        this.val = val;
    }

    public void operation(int amount)
    {
        if(amount>val*500)
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
            int denominator = amount/500;
            int withdrawn_val = denominator*500;
            val-=withdrawn_val;
            System.out.println(denominator + " 500 notes issued");
            if(withdrawn_val<amount)
            {
                nextCurrency.operation(amount-withdrawn_val);
            }
        }
    }
}
