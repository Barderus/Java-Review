package Basics;

public class wrapperReview {
    public static void main(String[] args) {
        /*
            Wrapper class -
                Provides a way to use primitive data types as reference data types
                Reference data types contain useful methods

            autoboxing - Automatic convert primitive data type -> wrapper
            unboxing - Convert wrapper --> data type
         */
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";

        if(a){
            System.out.println("This is True");
        }
    }
}
