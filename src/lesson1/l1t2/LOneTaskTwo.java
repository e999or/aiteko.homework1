package lesson1.l1t2;

import java.util.Scanner;

public class LOneTaskTwo {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int firstNum = (new Scanner(System.in)).nextInt();
        int even = firstNum % 2;
        if(firstNum < 0){
            System.out.println("Число меньше 0, отрицательное");
        }else if(firstNum >0){
            System.out.println("Число больше 0, положительное");
        }else if(firstNum == 0){
            System.out.println("Ноль");
        }
        if (firstNum !=0) {
            System.out.println(even == 0 ? "Чётное" : "Не чётное");
        }
    }
}
