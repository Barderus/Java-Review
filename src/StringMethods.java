import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String name = scanner.next();

        boolean result = name.equals("Bart");
        System.out.println("Is " + name + " equal to Bart? " + result);

        int size = name.length();
        System.out.println("Length of '"+ name + "': " + size);

        char first = name.charAt(0);
        System.out.println("The first character is: " + first);

        boolean empty = name.isEmpty();
        System.out.println("Is the string empty?: " + empty);

        String toUpper = name.toUpperCase();
        System.out.println(name + " in upper case: " + toUpper);

        String toLower = name.toLowerCase();
        System.out.println(name + " in lower case: " + toLower);

        String trimmed = name.trim();
        System.out.println("Trimmed string: " + trimmed);

        String replaced = name.replace('a', 'u');
        System.out.println("Replaced string: " + replaced);



    }
}
