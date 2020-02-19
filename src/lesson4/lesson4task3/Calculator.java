package lesson4.lesson4task3;

public class Calculator {
    // Реализовать класс Calculator, который будет содержать статические методы
    //для операций вычитания, сложения, умножения, деления и взятия процента от
    //числа. Класс должен работать как с целыми числами, так и с дробями.
    public static int plus(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int minus(int a, int b) {
        int difference = a - b;
        return difference;
    }

    public static int multiply(int a, int b) {
        int productMathematical = a * b;
        return productMathematical;
    }

    public static double division(int a, int b) {
        double fission =(double) a / b;
        return fission;
    }

    public static double percent(int a, int b) {
        double percent =(double)(b * a) / 100;
        System.out.println(percent);
        return percent;
    }
}
