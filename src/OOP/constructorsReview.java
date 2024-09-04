package OOP;

import java.util.Scanner;

public class constructorsReview {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your weight: ");
        double weight = scanner.nextDouble();

        Human human = new Human(name, age, weight);

        System.out.println("Enter your name: ");
        String name1 = scanner.next();

        System.out.println("Enter your age: ");
        int age1 = scanner.nextInt();

        System.out.println("Enter your weight: ");
        double weight1 = scanner.nextDouble();

        Human human1 = new Human(name1, age1, weight1);


        System.out.println("Hello, " + human.name);
        human.eat();

        System.out.println("Hello, " + human1.name);
        human1.drink();
    }
}
