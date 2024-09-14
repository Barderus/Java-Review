package OOP;

public class Food {
    String name;
    int quantity;
    boolean isSpoiled;

    public Food(String name, int quantity, boolean isSpoiled){

        this.name = name;
        this.quantity = quantity;
        this.isSpoiled = isSpoiled;
    }

    @Override
    public String toString(){
        return "\nFood name: " + name +
                "\nQuantity: " + quantity +
                "\nIs it spoiled?: " + isSpoiled;
    }
}
