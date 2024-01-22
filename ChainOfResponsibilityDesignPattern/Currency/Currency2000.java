package ChainOfResponsibilityDesignPattern.Currency;

public class Currency2000 extends Currency 
{
    public Currency2000(Currency obj, int val) {
        this.nextCurrency = obj;
        this.val = val;
    }

    public int getAvailableBalance()
    {
        if(nextCurrency!=null)
        {
            return nextCurrency.getAvailableBalance() + val*2000;
        }
        return val*2000;
    }

    public void operation(int amount) {
        if (amount > val * 2000) {
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
                    withdrawn_val = val * 2000;
                    System.out.println(val + " 2000 notes issued");
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
            int denominator = amount / 2000;
            int withdrawn_val = denominator * 2000;
            val -= denominator;
            System.out.println(denominator + " 2000 notes issued");
            if (withdrawn_val < amount) {
                nextCurrency.operation(amount - withdrawn_val);
            }
        }
    }
}
