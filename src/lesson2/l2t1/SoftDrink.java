package lesson2.l2t1;

public enum SoftDrink {
    BAIKAL("Байкал", 3),
    TATHUN("Тархун", 2),
    SAYANI("Саяны", 4);

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
