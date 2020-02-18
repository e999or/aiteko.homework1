package lesson3.lesson3task2;

import java.util.Random;
import java.util.Scanner;

public class MassivDiagonal {
    //Запросить у пользователя целое число N, создать двумерный масси
    //размером N на N. Заполнить его случайными числами и вывести на экран
    //сумму диагоналей массива.
    static int summ = 0;

    public static void main(String[] args) {
        int razmerMassiva = new Scanner(System.in).nextInt();
        createMassiv(razmerMassiva, razmerMassiva);
        System.out.println(summ);
    }

    public static void createMassiv(int first, int second) {
        Random random = new Random();
        int[][] arr = new int[first][second];
        int count = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(30);
                if (i == j) {
                    sumDiagonal(arr[i][j]);
                }
                if (j == count) {
                    sumDiagonal(arr[i][j]);
                    count--;
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void sumDiagonal(int variable) {
        summ += variable;
    }
}
