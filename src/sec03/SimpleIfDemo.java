package sec03;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number :  ");

        // Receive the int number from User.
        int number = in.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        }
        if (number % 2 == 1) {
            System.out.println("Odd");
        }

        System.out.println("End");
    }
}
