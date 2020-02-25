package lesson6.lesson6task3;

import java.util.*;

public class Unique {
    //Написать метод, который возвращает true, если в мапе нет двух и более
    //одинаковых value, и false в противном случае. Для пустой мапы метод
    //возвращает true.
    public static void main(String[] args) {
        Unique unique = new Unique();
        Map<String, String> names = new HashMap<>();
        names.put("1", "Smith");
        names.put("2", "Stanley");
        names.put("3", "Smith");
        System.out.println(unique.isUnique(names)); // false
        names.remove("3");
        System.out.println(unique.isUnique(names)); // false.
    }

    

    public boolean isUnique(Map<String, String> map) {
        boolean rezult = true;
        int count = 0;
        Set<String> coincidences = new HashSet<>();
        for (String s: map.values()){
            coincidences.add(s);
        }
        for (String s: map.values()) {
            if( coincidences.contains(s)){
                count++;
            }
        }
        if (count > 2) {
            rezult = false;
        }
        return rezult;
    }
    
}
