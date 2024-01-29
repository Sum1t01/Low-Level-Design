package CompositeDesignPattern.FileSystem.Files;
import java.util.*;

public class Directory implements File {
    String name;
    List<File>FileList;

    public Directory(String name)
    {
        this.name = name;
        FileList = new ArrayList<File>();
    }

    public void add(File f)
    {
        FileList.add(f);
    }

    public void display()
    {
        System.out.println(name);

        for(File f : FileList)
        {
            f.display();
        }
    }

}
