package lesson6.lesson6task3;

import java.util.List;
import java.util.Map;

public class Unique {
    //Написать метод, который возвращает true, если в мапе нет двух и более
    //одинаковых value, и false в противном случае. Для пустой мапы метод
    //возвращает true.
    static int count = 0;
    List<String> valuesS;

    public boolean isUnique(Map<String, String> map) {
        boolean rezult = true;
        for (String s: map.values()){
            valuesS.add(s);
        }
        compare(valuesS);
        if(count > 2){
            rezult = false;
        }
        return rezult;
    }

    public void compare (List<String>sList){
        for (int i = 0; i < sList.size()-1; i++) {
            for (int j = 0; j < sList.size()-1; j++) {
                if(sList.get(i).equals(sList.get(j))) {
                    count++;
                }
            }
        }
    }
}
