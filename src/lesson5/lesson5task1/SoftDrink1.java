package lesson5.lesson5task1;

public enum SoftDrink1 {

    Baikal("Байкал", 3),
    Tarhun("Тархун", 2),
    Sayani("Саяны", 4);

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
