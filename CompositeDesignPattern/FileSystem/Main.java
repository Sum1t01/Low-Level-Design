package CompositeDesignPattern.FileSystem;
import CompositeDesignPattern.FileSystem.Files.*;
public class Main {
    public static void main(String args[])
    {
        File mov1 = new Movie("Comedy Movie 1");
        File mov2 = new Movie("Comedy Movie 2");
        File mov3 = new Movie("Comedy Movie 3");
        File mov4 = new Movie("Comedy Movie 4");
        File mov5 = new Movie("Comedy Movie 5");
        File mov6 = new Movie("Comedy Movie 6");

        Directory d2 = new Directory("Comedy Movie");
        d2.add(mov1); d2.add(mov2);

        Directory d1 = new Directory("Comedy Horror Movie");
        d1.add(mov3); d1.add(mov4); d1.add(mov5); d1.add(mov6);

        d2.add(d1);

        d2.display();

    }
}
