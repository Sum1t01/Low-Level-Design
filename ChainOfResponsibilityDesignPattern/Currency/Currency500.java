package ChainOfResponsibilityDesignPattern.Currency;

public class Currency500 extends Currency{
    public Currency500(Currency obj, int val)
    {
        this.nextCurrency = obj;
        this.val = val;
    }

    public int getAvailableBalance()
    {
        if(nextCurrency!=null)
        {
            return nextCurrency.getAvailableBalance() + val*500;
        }
        return val*500;
    }

    public void operation(int amount)
    {
        if (amount > val * 500) {
            if (nextCurrency != null) 
            {
                if(getAvailableBalance()<amount)
                {
                    System.out.println("Insufficient balance!");
                    return;
                }
                else
                {
                    int withdrawn_val = 0;
                    withdrawn_val = val * 500;
                    System.out.println(val + " 500 notes issued");
                    val = 0;
                    nextCurrency.operation(amount - withdrawn_val);
                }   
            } 
            else 
            {
                System.out.println("Insufficient balance!");
                return;
            }
        } 
        else 
        {
            int denominator = amount / 500;
            int withdrawn_val = denominator * 500;
            val -= denominator;
            System.out.println(denominator + " 500 notes issued");
            if (withdrawn_val < amount) {
                nextCurrency.operation(amount - withdrawn_val);
            }
        }
    }
}
