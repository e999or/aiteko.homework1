package lesson2.l2t1;

public class Menu {
    public Menu() {

        Baikal baikal = new Baikal();
        baikal.setNameDrink("Байкал");
        baikal.setCost(3);
        baikal.setNumberButton(1);

        Tarhun tarhun = new Tarhun();
        tarhun.setNameDrink("Тархун");
        tarhun.setCost(2);
        tarhun.setNumberButton(2);

        Sayani sayani = new Sayani();
        sayani.setNameDrink("Саяны");
        sayani.setCost(4);
        sayani.setNumberButton(3);
    }
}
