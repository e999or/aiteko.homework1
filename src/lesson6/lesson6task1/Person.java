package lesson6.lesson6task1;

import java.util.Comparator;

public class Person implements Comparator<Person> {
    int age;
    String name;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public int compare(Person p1, Person p2) {
        int personAge = p1.getAge() - p2.getAge();
        return personAge;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
