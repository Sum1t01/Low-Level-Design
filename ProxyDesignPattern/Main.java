package ProxyDesignPattern;

import ProxyDesignPattern.Employee.Employee;
import ProxyDesignPattern.Employee.EmployeeProxy;

public class Main {
    public static void main(String args[])
    {
        Employee e = new EmployeeProxy();
        e.get("ADMIN", "1");
    }
}
