package ChainOfResponsibilityDesignPattern.Currency;

public class Currency1000 extends Currency{
    public Currency1000(Currency obj, int val)
    {
        this.nextCurrency = obj;
        this.val = val;
    }


    public int getAvailableBalance()
    {
        if(nextCurrency!=null)
        {
            return nextCurrency.getAvailableBalance() + val*1000;
        }
        return val*1000;
    }


    public void operation(int amount)
    {
        if (amount > val * 1000) {
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
                    withdrawn_val = val * 1000;
                    System.out.println(val + " 1000 notes issued");
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
            int denominator = amount / 1000;
            int withdrawn_val = denominator * 1000;
            val -= denominator;
            System.out.println(denominator + " 1000 notes issued");
            if (withdrawn_val < amount) {
                nextCurrency.operation(amount - withdrawn_val);
            }
        }
    }
}
