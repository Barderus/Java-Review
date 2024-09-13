/*
    Create a Simple Person Class
    Create a Person class with fields name, age, and gender.
    Write methods to set and get the values of each field.
    Add a method to print the details of a Person.
 */

package OOP;
import java.util.Scanner;

public class personDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Get the size of the family array
        int members;

        System.out.println("How many members in your family?");
        members = scanner.nextInt();

        // Create an array family with the members as size
        String[] family = new String[members];

        // Initialize the variables for the class attributes
        String fname;
        String lname;
        int age;
        String gender;

        System.out.println("What's the family name: ");
        lname = scanner.next();
        for(int i = 0; i < family.length; i++){
            System.out.println("\nWhat's the member's name: ");
            fname = scanner.next();
            System.out.println("What's the" + fname + "age: ");
            age = scanner.nextInt();
            System.out.println("What's the" + fname + "sex: ");
            gender = scanner.next();

            Person famMember = new Person(fname, lname, age, gender);
            family[i] = famMember.toString();
        }
        for (String element : family) {
            System.out.println(element);
        }
    }
}
