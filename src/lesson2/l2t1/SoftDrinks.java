package lesson2.l2t1;

public class SoftDrinks {
    private String nameDrink;
    private int cost;
    private int numberButton;


    public void setNameDrink(String nameDrink) {
        System.out.print("Напиток "+(this.nameDrink = nameDrink));
    }

    public void setCost(int cost) {
        System.out.print(". Цена "+(this.cost = cost)+" р. ");
    }

    public void setNumberButton(int numberButton) {
        System.out.println("Клавиша № " + (this.numberButton = numberButton));
    }

}
