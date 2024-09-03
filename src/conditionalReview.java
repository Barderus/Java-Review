import java.util.Scanner;

public class conditionalReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter today's temperature: ");
        int temp = scanner.nextInt();

        if (temp > 30){
            System.out.println("It's hot outside!");
        }
        else if (temp >= 20){
            System.out.println("It is warm outside!");
        }
        else {
            System.out.println("It is cold outside!");
        }
    }
}