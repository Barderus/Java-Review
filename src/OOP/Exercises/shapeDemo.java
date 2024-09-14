/*
    Shape Class with Inheritance
Create a base class Shape with a method area().
Create derived classes Rectangle, Circle, and Triangle that override the area() method.
Demonstrate polymorphism by calculating the area for each shape.
 */
package OOP.Exercises;

import java.util.Scanner;

public class shapeDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double pi = 3.14159;

        double radius;
        double height;
        double base;
        double length;
        double width;

        System.out.println("Would you like to calculate the area for \n1. Circle\n2. Triangle\n3. Rectangle");
        int choice = scanner.nextInt();

        if(choice == 1){
            Circle circle = new Circle();

            System.out.println("Enter the value of the radius: ");
            radius = scanner.nextDouble();

            double circleArea = circle.area(pi, radius);
            System.out.println("Area of a circle: " + circleArea);
        }
        else if(choice == 2){
            Triangle triangle = new Triangle();

            System.out.println("Enter the value of the height: ");
            height = scanner.nextDouble();
            System.out.println("Enter the value of the base: ");
            base = scanner.nextDouble();

            double triangleArea = triangle.area(height, base);
            System.out.println("Area of a triangle: " + triangleArea);

        }
        else if (choice == 3) {
            Rectangle rectangle = new Rectangle();

            System.out.println("Enter the value of the length: ");
            length = scanner.nextDouble();
            System.out.println("Enter the value of the width: ");
            width = scanner.nextDouble();

            double rectangleArea = rectangle.area(length, width);
            System.out.println("Area of rectangle: " + rectangleArea);
        }
        else{
            System.out.println("Invalid choice.");

        }










    }
}
