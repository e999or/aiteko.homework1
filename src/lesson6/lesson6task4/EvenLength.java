package lesson6.lesson6task4;

import java.util.Iterator;
import java.util.Set;

public class EvenLength {
    //Написать метод, который возвращает множество, в котором удалены все
    //элементы четной длины из исходного множества.
    //Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"]
    //метод вернет ["foo", "bar", "spoon", "!"]

    public Set<String> removeEvenLength(Set<String> set){
        Iterator<String> i = set.iterator();
        while (i.hasNext()){
            if(i.next().length() % 2 == 0 ){
                set.remove(i.next());
            }
        }

        return set;
    }
}
