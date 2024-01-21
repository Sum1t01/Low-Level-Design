package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.Factory.Factory;
import AbstractFactoryDesignPattern.Students.Students;

public class Main {
    public static void main(String args[])
    {
        Factory f = new Factory();
        Students s = f.getStudents("MS", "MBA");
        s.printExamScore();
    }
}
