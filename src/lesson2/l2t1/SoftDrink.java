package lesson2.l2t1;

public class SoftDrink {
    private final String nameDrink;
    private int cost;
    private int numberButton;

    SoftDrink(String nameDrink, int cost, int numberButton) {
        this.nameDrink = nameDrink;
        this.cost = cost;
        this.numberButton = numberButton;
    }

    public String getNameDrink() {
        return  nameDrink;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNumberButton() {
        return numberButton;
    }

    public void setNumberButton(int numberButton) {
        this.numberButton = numberButton;
    }
}
