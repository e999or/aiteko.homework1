package lesson5.lesson5task2;

import lesson5.lesson5task3.Run;
import lesson5.lesson5task3.Swim;

public class Dog extends Animal implements Run, Swim{

    public Dog(String name) {
        super(name);
        System.out.println(name);
    }

    @Override
    void getName() {

    }

    @Override
    public void flee() {

    }

    @Override
    public void escape() {

    }

    @Override
    public void sail() {

    }

    @Override
    public void dive() {

    }
}
