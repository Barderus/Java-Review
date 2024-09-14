package OOP;

public class Friend {

    String name;

    // Static keyword shares the same variable of a given class
    static int numberOfFriends;

    public Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.println("You have " + numberOfFriends + " friends.");
    }
}
