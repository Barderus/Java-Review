package OOP;

public class Intro {
    public static void main(String[] args) {

        // Instantiated the object
        Car myCar = new Car();

        System.out.print(myCar.make);
        System.out.println(" " + myCar.model);
        System.out.println("Price: " + myCar.price);
        myCar.drive();
        myCar.brake();
    }
}
