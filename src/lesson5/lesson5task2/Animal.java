package lesson5.lesson5task2;

public abstract class Animal {
    // Написать абстрактный класс Animal с абстрактным методом getName. Сделать
    //несколько классов животных, наследников Animal. Метод getName должен выводит
    //название каждого животного
    private static String name;


    public Animal(String name) {
        this.name = name;
    }

    public void getNamme() {
        System.out.println(name);
    }
}
