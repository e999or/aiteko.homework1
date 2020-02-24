package lesson5.lesson5task1;




public class VandigMachine1 {
    private SoftDrink1[] drinks = SoftDrink1.values();
    private double deposit;
    private SoftDrink1 choseDrink;
    private int numberButton = 1;


    public void choseDrink(int num){
        try {
            choseDrink = drinks[num - 1];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Вы ни чего не выбрали");
        }
    }

    public void showMenu(){
        for(SoftDrink1 s : drinks){
            System.out.println("Напиток " + s.getNameDrink() + "\t Цена " + s.getCost()+"р." + "\t Номер кнопки " + numberButton);
            numberButton++;
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
            getDepozit();
            return null;
        }
        if (deposit >= choseDrink.getCost()){
            System.out.println("Ваш напиток " + choseDrink.getNameDrink());
            System.out.print("Ваша сдача " + Double.toString(deposit - choseDrink.getCost()) + "р.");
            return choseDrink;
        }else{
            System.out.println("Пополните счёт");
            getDepozit();
            return null;
        }
    }
}
