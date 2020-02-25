package lesson5.lesson5task1;

import lesson2.l2t1.VandigMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main (String[] args){
        List<SoftDrink1> s= new ArrayList<SoftDrink1>();

        s.add(new SoftDrink1("ба",3));
        VandigMachine1 v = new VandigMachine1(s);
        SoftDrink1 drink;
        drink = v.buyDrink(); // не был выбран напиток
        v.inputMoney(10); // на счету лежит 10
        drink = v.buyDrink(); // не был выбран напиток
        v.showMenu(); // показано меню
        v.choseDrink(-10); // несуществующий напиток
        drink = v.buyDrink(); // не был выбран напиток
        v.choseDrink(0); // напиток выбран
        drink = v.buyDrink(); // едостаточно средств
        v.inputMoney(100); // на счету лежит 110
        drink = v.buyDrink(); // успешная покупка
    }
}
