package lesson4.lesson4task2;

public class Expir {//extends Final { //  не наследуемый

   // public final abstract class Abstr { // абстрактные файлы не могут быть final



    class Sclass {
        public final void print(){
            System.out.println("text");
        }
    }

    class SuClass extends Sclass{
       // public void print(){            // метод не может быть override переопределить
          //  System.out.println("MyReport");
    }


}
