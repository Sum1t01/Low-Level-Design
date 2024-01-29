package AdapterDesignPattern;
import AdapterDesignPattern.Adaptor.*;
public class Main {
    public static void main(String args[])
    {
        Kilo machine = new AdultMachineKilo();
        System.out.println(machine.getWeightInKilo());
    }
}
