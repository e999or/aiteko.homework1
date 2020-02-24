package lesson2.l2t1;

public class SoftDrink {


    private final String nameDrink;
    private int cost;


    SoftDrink(String nameDrink, int cost) {
        this.nameDrink = nameDrink;
        this.cost = cost;

    }

    public String getNameDrink() {
        return nameDrink;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

}
