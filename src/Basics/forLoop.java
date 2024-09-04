package Basics;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i <= 10; i++){
            System.out.println(i);

        }
        System.out.println();
        for(int c = 10; c >= 0; c--){
            if(c == 0){
                System.out.println("Happy New Year!");
            }
            else {
                System.out.println(c);
            }
        }
    }
}
