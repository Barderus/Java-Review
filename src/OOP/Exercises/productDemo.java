/*
    Online Store with Encapsulation
Create a Product class with fields for name, price, and quantity.
Use private access for the fields and provide public getter and setter methods.
Write a method that checks if the product is in stock based on the quantity.
 */

package OOP.Exercises;

public class productDemo {

    public static void main(String[] args) {

        Product[] products = {
                new Product("Laptop", 999.99, 10),
                new Product("Smartphone", 699.99, 0),
                new Product("Wireless Headphones", 129.99, 25),
                new Product("Smartwatch", 199.99, 15),
                new Product("Tablet", 299.99, 0),
                new Product("Bluetooth Speaker", 49.99, 50),
                new Product("External Hard Drive", 89.99, 30),
                new Product("Gaming Console", 399.99, 5),
                new Product("4K Monitor", 349.99, 0),
                new Product("Mechanical Keyboard", 119.99, 20),
                new Product("Gaming Mouse", 59.99, 40),
                new Product("Webcam", 69.99, 0),
                new Product("Fitness Tracker", 99.99, 12),
                new Product("Drone", 499.99, 8),
                new Product("Digital Camera", 549.99, 7),
                new Product("Portable Charger", 29.99, 100),
                new Product("Smart Home Hub", 129.99, 0),
                new Product("Action Camera", 199.99, 18),
                new Product("Electric Toothbrush", 39.99, 45),
                new Product("VR Headset", 299.99, 0)
        };

        System.out.println("Products out of stock: ");
        for (Product product : products) {
            if (product.getQuantity() == 0) {
                System.out.println(product);
            }
        }
    }
}
