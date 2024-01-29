package AdapterDesignPattern.Adaptor;

import AdapterDesignPattern.Adaptee.*;

public class AdultMachineKilo implements Kilo {
    Pound adult = new AdultMachinePound();

    public double getWeightInKilo()
    {
        return 0.6 * adult.getWeightInPound();
    }
}
