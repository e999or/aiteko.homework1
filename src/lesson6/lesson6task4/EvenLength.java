package lesson6.lesson6task4;

import java.util.Set;

public class EvenLength {
    //Написать метод, который возвращает множество, в котором удалены все
    //элементы четной длины из исходного множества.
    //Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"]
    //метод вернет ["foo", "bar", "spoon", "!"]

    public Set<String> removeEvenLength(Set<String> set){
        for(String s : set){
            if(s.length() % 2 == 0 ){
                set.remove(s);
            }
        }

        return set;
    }
}
