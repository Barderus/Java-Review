package Basics;

import java.util.Scanner;

public class introMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.next();

        hello(name);

        int x = 3;
        int y = 4;

        int result = add(x, y);
        System.out.println(x + " + " + y + " = " + result);
    }

    // Hello method
    static void hello(String name){
        System.out.println("Hello, " + name);

    }

    // Return method
    static int add(int x, int y){
        return x + y;
    }
}
