package lesson3.lesson3task3;

public class Fibonachi {
    //Реализовать расчет и вывод в консоль последовательности чисел
    //Фибоначчи до указанного пользователем N, посредством рекурсии
    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }

    public static int fibonacci(int fib) {
        if (fib < 2) {
            return fib;
        } else {
            return (fibonacci(fib - 1) + fibonacci(fib - 2));
        }
    }
}
