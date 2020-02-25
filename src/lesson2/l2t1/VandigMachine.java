package lesson2.l2t1;


import java.util.Arrays;
import java.util.List;

public class VandigMachine {
    private List<SoftDrink> drinks;
    private double deposit;
    private SoftDrink choseDrink;
    private int numberButton = 1;

    VandigMachine(){
        drinks = Arrays.asList(
                new SoftDrink("Байкал", 3),
                new SoftDrink("Тархун", 2),
                new SoftDrink("Саяны", 4)
        );
    }

    public void choseDrink(int num){
        try{
        choseDrink = drinks.get(num - 1);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Вы ни чего не выбрали");
        }
    }

    public void showMenu(){
        for(SoftDrink s : drinks){
            System.out.println("Напиток " + s.getNameDrink() + "\t Цена " + s.getCost()+"р." + "\t Номер кнопки " + numberButton);
            numberButton++;
        }
        return;
    }

    public void inputMoney(double money){
        deposit += money;
    }

    public double getDepozit(){
        System.out.println("Ваша сдача " + deposit + "р. ");
        return deposit;
    }

    public SoftDrink buyDrink(){
        if(choseDrink == null){
            System.out.println("Выберите напиток");
            return null;
        }
        if (deposit >= choseDrink.getCost()){
            System.out.println("Ваш напиток " + choseDrink.getNameDrink());
            System.out.print("Ваша сдача " + Double.toString(deposit - choseDrink.getCost()));
            return choseDrink;
        }else{
            System.out.println("Пополните счёт");
            getDepozit();
            return null;
        }
    }
}
