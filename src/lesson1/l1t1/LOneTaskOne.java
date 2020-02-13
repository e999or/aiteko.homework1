package lesson1.l1t1;

import java.util.Scanner;

public class LOneTaskOne {
    public static void main(String[] args){
        System.out.println("Введите первое число");
        int firstNum = (new Scanner(System.in)).nextInt();
        System.out.println("Введите второе число");
        int secondNum = (new Scanner(System.in)).nextInt();

        if(firstNum < secondNum){
            System.out.println("Первое число минимальное");
        }else if(firstNum > secondNum){
            System.out.println("Второе число минимальное");
        }else {
            System.out.println("Числа равны");
        }

       // System.out.println(firstNum < secondNum ? "Первое число минимальное" : "Второе число минимальное" );
    }
}
