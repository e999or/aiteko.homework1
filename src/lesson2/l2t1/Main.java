package lesson2.l2t1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        VandigMachine vandigMachine = new VandigMachine();
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
