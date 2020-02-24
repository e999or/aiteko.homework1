package lesson5.lesson5task2;

import lesson5.lesson5task3.Fly;
import lesson5.lesson5task3.Run;
import lesson5.lesson5task3.Swim;

public class Duck extends Animal implements Run, Fly, Swim{
    public Duck(String name) {
        super(name);
        System.out.println(name);
    }

    @Override
    void getName() {

    }

    @Override
    public void flying() {

    }

    @Override
    public void soar() {

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
