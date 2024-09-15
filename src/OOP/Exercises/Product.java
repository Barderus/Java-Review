/*
    Online Store with Encapsulation
Create a Product class with fields for name, price, and quantity.
Use private access for the fields and provide public getter and setter methods.
Write a method that checks if the product is in stock based on the quantity.
 */

package OOP.Exercises;

public class Product {

    private String name;
    private  double price;
    private int quantity;

    Product(String name, double price, int quantity){
        this.setName(name);
        this.setPrice(price);
        this.setQuantity(quantity);
    }

    // Getters
    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "\nProduct name: " + name +
                "\nPrice: " + price +
                "\nQuantity: " + quantity;
    }
}
