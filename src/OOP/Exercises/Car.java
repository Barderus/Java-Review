/*
    Car Class with Static Variable
Create a Car class with fields brand, model, and price.
Add a static field to keep track of the number of Car objects created.
Implement methods to display car details and show the total number of cars created.
 */
package OOP.Exercises;

public class Car {
    String brand;
    String model;
    double price;
    static int numberOfCars;

    public Car(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
        numberOfCars++;
    }

    public String toString(){
        return "\nCar brand: " + brand +
                "\nCar model: " + model +
                "\nCar price: " + price +
                "\nCars created: " + numberOfCars;
    }
}
