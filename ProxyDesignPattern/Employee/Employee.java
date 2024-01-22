package ProxyDesignPattern.Employee;

public interface Employee {
    void add(String client, String name, String id);
    void delete(String client, String id);
    void get(String client, String id);
}
