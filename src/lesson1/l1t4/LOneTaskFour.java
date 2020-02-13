package lesson1.l1t4;

import java.util.Scanner;

public class LOneTaskFour {
    public static void main(String[] args) {
        System.out.println("Введите число N");
        int firstNum = (new Scanner(System.in)).nextInt();
        int rezult =0;
        for (int i = 0; i <= firstNum; i++) {
            rezult += firstNum;
            System.out.println(rezult);
        }
    }
}
