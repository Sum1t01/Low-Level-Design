package ProxyDesignPattern.Employee;

public class EmployeeDAO implements Employee{
    
    public void add(String client, String name, String id)
    {
        System.out.println("Employee " + name + " with ID " + id + " added by " + client);
    }

    public void delete(String client, String id)
    {
        System.out.println("Employee with ID " + id + " deleted by " + client);
    }

    public void get(String client, String id)
    {
        System.out.println("Employee information with ID " + id + " accessed by " + client);
    }
}
