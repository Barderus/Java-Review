package OOP.Inheritance;

public class demo {

    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bike = new Bicycle();

        car.go();
        bike.stop();
        System.out.println(car.doors);
        System.out.println(bike.paddles);
    }
}
