package lesson6.lesson6task1;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int s = o1.getName().length() - o2.getName().length();
        return s;
    }
}
