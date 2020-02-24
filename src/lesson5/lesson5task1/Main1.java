package lesson5.lesson5task1;

import lesson2.l2t1.VandigMachine;

import java.util.Scanner;

public class Main1 {
    public static void main (String[] args){
        VandigMachine1 vandigMachine = new VandigMachine1();
        System.out.println("\t \tДобро пожаловать в МЕНЮ !" );
        vandigMachine.showMenu();
        System.out.println("\t \t Внесите средства");
        int deposit = (new Scanner(System.in)).nextInt();
        vandigMachine.inputMoney(deposit);
        System.out.println("\t \t Выберите напиток");
        int numberButton = (new Scanner(System.in)).nextInt();
        vandigMachine.choseDrink(numberButton);
        vandigMachine.buyDrink();
    }
}
