package Basics;

public class arrays2D {
    public static void main(String[] args) {

        // 2D array = an array of arrays
        // 3x3 array
        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Ranger";
        cars[1][1] = "Silverado";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";

        for (String[] car : cars) {
            System.out.println();
            for (String s : car) {
                System.out.print(s + " ");
            }
        }

        String[][] countries = {{"Brazil", "Canada", "USA"},
                                {"Japan", "China", "Korea"},
                                {"England", "Germany", "Sweden"}};

    }
}
