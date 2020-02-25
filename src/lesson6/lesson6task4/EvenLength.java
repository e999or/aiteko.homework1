package lesson6.lesson6task4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EvenLength {
    //Написать метод, который возвращает множество, в котором удалены все
    //элементы четной длины из исходного множества.
    //Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"]
    //метод вернет ["foo", "bar", "spoon", "!"]

    public static void main(String[] args) {
        EvenLength evenLength = new EvenLength();
        Set<String> strings = new HashSet<String>();
        strings.add("foo");
        strings.add("buzz");
        strings.add("bar");
        strings.add("fork");
        System.out.println(evenLength.removeEvenLength(strings));
    }

    public Set<String> removeEvenLength(Set<String> set){
        Set<String> tmp = new HashSet<>();
        for(String s : set){
            if(s.length() % 2 == 0 ){
                tmp.add(s);
            }
        }
        set.removeAll(tmp);
        return set;
    }
}
