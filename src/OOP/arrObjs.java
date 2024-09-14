package OOP;

import java.util.Arrays;

public class arrObjs {

    public static void main(String[] args) {

        Food food1 = new Food("Pizza",4, false);
        Food food2 = new Food("Hamburguer", 1, true);
        Food food3 = new Food("Hotdog", 7, false);

        Food[] refrigerator = {food1, food2, food3};

        // One way to display the array
        System.out.println(Arrays.toString(refrigerator));

        // Second way to display it.
        for (Food food : refrigerator){
            System.out.println(food);
        }
    }
}
