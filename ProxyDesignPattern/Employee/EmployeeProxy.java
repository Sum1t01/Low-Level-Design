package ProxyDesignPattern.Employee;

public class EmployeeProxy implements Employee {
    Employee e = new EmployeeDAO();
    public void add(String client, String name, String id)
    {
        if(client=="ADMIN")
        {
            e.add(client, name, id);
        }
        else
        {
            System.out.println("PERMISSION DENIED!!");
        }
    }

    public void delete(String client, String id)
    {
        if(client=="ADMIN")
        {
            e.delete(client, id);
        }
        else
        {
            System.out.println("PERMISSION DENIED!!");
        }
    }

    public void get(String client, String id)
    {
        if(client=="ADMIN" || client=="USER")
        {
            e.get(client, id);
        }
        else
        {
            System.out.println("PERMISSION DENIED!!");
        }
    }

}
