package lesson5.lesson5task1;

public class SoftDrink1 {

    private final String nameDrink;
    private int cost;


   SoftDrink1(String nameDrink, int cost) {
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
