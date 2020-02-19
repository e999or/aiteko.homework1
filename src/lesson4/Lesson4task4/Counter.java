package lesson4.Lesson4task4;

public class Counter {
    // Реализовать класс в конструкторе которого будет счетчик количества
    //создаваемых объектов. Написать метод для получения информации о
    //количестве.

    static int counter = 0;
    private int i = 0;
    public Counter(int i) {
        this.i = i;
        counter++;
        printCounter();
    }


    public static void printCounter(){
        System.out.println(counter);
    }
}
