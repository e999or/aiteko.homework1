package lesson5.lesson5task1;

import java.util.List;

public class VandigMachine1 {
    private List<SoftDrink1> drinks;
    private double deposit;
    private SoftDrink1 choseDrink;




    VandigMachine1(){

    }

    public VandigMachine1(List<SoftDrink1> listDrinks) {
        drinks = listDrinks;
    }

    public void choseDrink(int num){
        try {
            choseDrink = drinks.get(num);
            deposit -= choseDrink.getCost();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Вы ни чего не выбрали");
        }
    }

    public void showMenu(){
        System.out.println("\t \tДобро пожаловать в МЕНЮ !" );
        for (int i = 0; i < drinks.size(); i++) {
            SoftDrink1 s = drinks.get(i);
            System.out.println("Напиток " + s.getNameDrink() + "\t Цена " + s.getCost()+"р." + "\t Номер кнопки " + i);
        }
    }

    public void inputMoney(double money){
        deposit += money;
    }

    public double getDepozit(){
        System.out.println("Ваша сдача " + deposit + "р. ");
        return deposit;
    }

    public SoftDrink1 buyDrink(){
        if(choseDrink == null){
            System.out.println("\t \t Вы ни чего не выбрали");
            return null;
        }
        if (deposit >= choseDrink.getCost()){
            System.out.println("Ваш напиток " + choseDrink.getNameDrink());
            System.out.print("Ваша сдача " + Double.toString(deposit ) + "р.");
            return choseDrink;
        }else{
            System.out.println("Пополните счёт");
            getDepozit();
            return null;
        }
    }
}
