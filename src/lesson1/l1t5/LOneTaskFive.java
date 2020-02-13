package lesson1.l1t5;

import java.util.Scanner;

public class LOneTaskFive {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int years = scn.nextInt();
        int a = years % 100;
        int b = years % 400;
        int c = years % 4;
        if (a == 0 && b != 0){
            int x = 365;
            System.out.print("количество дней в году: " + x);
        }
        else if ( a== 0 && b == 0) {
            int x = 366;
            System.out.print("количество дней в году: " + x);
        }else if ( a != 0 && c == 0){
            int x = 366;
            System.out.print("количество дней в году: " + x);
        }else {
            int x = 365;
            System.out.print("количество дней в году: " + x);
        }
    }
}
