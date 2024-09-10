package OOP;

import java.util.Random;

public class diceRoller {

    Random rand = new Random();
    int number;

    diceRoller(){
        roll();
    }

    void roll(){
        number = rand.nextInt(6) + 1;
        System.out.println(number);
    }
}
