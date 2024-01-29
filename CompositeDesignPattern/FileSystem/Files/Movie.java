package CompositeDesignPattern.FileSystem.Files;

public class Movie implements File {
    String name;

    public Movie(String name)
    {
        this.name = name;
    }

    public void display()
    {
        System.out.println(name);
    }
}
