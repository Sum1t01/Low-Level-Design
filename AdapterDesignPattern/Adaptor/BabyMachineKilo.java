package AdapterDesignPattern.Adaptor;
import AdapterDesignPattern.Adaptee.*;
public class BabyMachineKilo implements Kilo {
    Pound baby = new BabyMachinePound();
    public double getWeightInKilo()
    {
        return 0.6 * baby.getWeightInPound();
    }
}
