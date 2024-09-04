package Basics;

import java.util.ArrayList;

public class ArrayListReview {
    public static void main(String[] args) {

        // ArrayList - A resizable array

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Hamburguer");
        food.add("Hotdog");

        food.set(0, "Sushi"); // Replace "Pizza" by "Sushi"
        food.remove(2);
        food.clear();

        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
