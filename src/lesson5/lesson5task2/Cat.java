package lesson5.lesson5task2;

import lesson5.lesson5task3.Run;


public class Cat extends Animal implements Run{

    public Cat(String name) {
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
}
