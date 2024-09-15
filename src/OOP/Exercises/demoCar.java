/*
    Car Class with Static Variable
Create a Car class with fields brand, model, and price.
Add a static field to keep track of the number of Car objects created.
Implement methods to display car details and show the total number of cars created.
 */

package OOP.Exercises;

public class demoCar {

    public static void main(String[] args) {

        Car gcar = new Car("Toyota", "RAV4", 54000);
        System.out.println(gcar);

        Car fcar = new Car("Subaru", "Outback", 38500);
        System.out.println(fcar);
    }
}
