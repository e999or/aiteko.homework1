package lesson2.l2t1;

public class Menu {

    private SoftDrink[] softDrinks;
    public Menu() {
        listSoftdrink();
        for (int i = 0; i < softDrinks.length; i++) {
            System.out.println("Напиток " + softDrinks[i].getNameDrink() + "\t Цена " + softDrinks[i].getCost()+"р." + "\t Номер кнопки №" + softDrinks[i].getNumberButton());

        }

    }

    public void listSoftdrink() {

        SoftDrink softDrinkBaikal = new SoftDrink("Байкал", 3, 1);
        SoftDrink softDrinkTarhun = new SoftDrink("Тархун", 2, 2);
        SoftDrink softDrinkSayani = new SoftDrink("Саяны", 4, 3);
        softDrinks = new SoftDrink[]{softDrinkBaikal, softDrinkSayani, softDrinkTarhun};

    }

}
