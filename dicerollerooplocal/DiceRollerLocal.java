package dicerollerooplocal;

import java.util.Random;

public class DiceRollerLocal {


    //metoda local
   public DiceRollerLocal(){
        Random random = new Random();

        int number = 0;
        roll(random,number);
        number = 5;

    }

    public  void roll(Random random, int number2){
       number2 = random.nextInt(6)+1;
        System.out.println(number2);


    }
}
