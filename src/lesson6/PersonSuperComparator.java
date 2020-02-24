package lesson6;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator <Person>{
    //Написать класс PersonSuperComparator, который имплементит Comparator,
    //но умеет сравнивать по двум параметрам: возраст и имя. Класс Person
    //теперь содержит два поля int age и String name.
    @Override
    public int compare(Person o1, Person o2) {
        return o1.age;
    }






}
