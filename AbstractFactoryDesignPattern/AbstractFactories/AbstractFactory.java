package AbstractFactoryDesignPattern.AbstractFactories;

import AbstractFactoryDesignPattern.Students.Students;

public interface AbstractFactory {
    Students getScore(String obj);
}
