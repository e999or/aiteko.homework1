package lesson3.lesson3task1;

import java.util.Arrays;

public class SortirovkaMassiva {
    // Реализовать алгоритм сортировки массива пузырьком и попытаться его
    //оптимизировать. Оптимизацию будем "считать" количеством итераций цикла
    static int[] arr = {1, 3, 7, 2};

    public static void main(String[] args) {
        /*for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]){
                swap(i, i + 1);
                i = -1;
            }
        }
        for (int i:arr) {
            System.out.print(i);
        }
        */
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(i, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int i, int j) {
        int buff = arr[i];
        arr[i] = arr[j];
        arr[j] = buff;
    }

}
