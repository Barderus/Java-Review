public class printf {
    public static void main(String[] args) {

        // printf = allows for formating

        // %d allows you place the value anywhere
        System.out.printf("This is a format string %d", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Dog";
        int myInt = 50;
        double myDouble = 1000;

        // Conversion characters
        System.out.printf("%b\n", myBoolean);
        System.out.printf("%c\n", myChar);
        System.out.printf("%s\n", myString);
        System.out.printf("%d\n", myInt);
        System.out.printf("%f\n", myDouble);

        // Width between "" and the variable/value
        System.out.printf("Hello %10s\n", myString);

        // Precision
        System.out.printf("You have $%.2f\n",myDouble);

        // Flags - Add an effect to output
            /*
                - left justify
                + output a plus or minus for numerica value
                0 numeric values are zero-padded
                , comma grouping separator
             */
        System.out.printf("You have $%20f\n", myDouble);
        System.out.printf("You have $%+020f\n", myDouble);
        System.out.printf("You have $%+,.2f\n", myDouble);


    }
}
