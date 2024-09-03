import java.util.Scanner;

public class arraysReview {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // You cannot store more than one datat type.
        String[] cars = {"Camaro", "Corvette", "Tesla"};

        // Accessing an array element
        cars[1] = "Mustang";

        System.out.println(cars[2]);

        String[] countries = new String[3];

        System.out.println("Enter a country's name: ");
        countries[0] = scanner.next();
        System.out.println("Enter another country's name: ");
        countries[1] = scanner.next();
        System.out.println("Enter another country's name: ");
        countries[2] = scanner.next();

        for(int i=0; i < countries.length;i++){
            System.out.println(countries[i]);
        }
    }
}
