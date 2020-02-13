package lesson2.l2t1;

import java.util.Scanner;

public class VandigMachine {
    public static void main(String [] args){
        String needMore= "недостаточно средств";
        Menu menu = new Menu();
        System.out.println("Внесите денежные средства");
        int money = (new Scanner(System.in)).nextInt();
        System.out.println("Выберите напиток ");
        int buttonDrink = (new Scanner(System.in)).nextInt();
        if(buttonDrink == 1 ){
            if (money >= 3) {
                System.out.println("Вы оплатили напиток Байкал. Спасибо за покупку!");
            } else if(money < 3) {
                System.out.println(needMore);}
        }else if(buttonDrink == 2 ){
            if (money >= 2) {
                System.out.println("Вы оплатили напиток Тархун. Спасибо за покупку!");
            } else if(money < 2) {
                System.out.println(needMore);}
        }else if(buttonDrink == 3){
            if (money >= 4) {
                System.out.println("Вы оплатили напиток Тархун. Спасибо за покупку!");
            } else if(money < 4) {
                System.out.println(needMore);}
        }else if(buttonDrink > 3 || buttonDrink ==0){
            System.out.println("Не существует напитка, выберите клавишу от 1 до 3х");
        }else if (money == 0){
            System.out.println("Вы не внесли средства");
        }
    }

}
