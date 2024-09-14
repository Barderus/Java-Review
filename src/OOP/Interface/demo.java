package OOP.Interface;

public class demo {

    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish smallFish = new Fish();
        smallFish.flee();

        Fish bigFish = new Fish();
        bigFish.hunt();
    }
}
