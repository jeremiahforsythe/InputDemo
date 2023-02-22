package com.mycompany.InputDemo;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer:");
            int myInt = input.nextInt();
            System.out.printf("You entered %d.%n%n", myInt);

            System.out.print("Enter a Double:");
            double myDouble = input.nextDouble();
            System.out.printf("You entered %f.%n%n", myDouble);

            System.out.print("Enter a String:");
            input.nextLine();
            String myString = input.nextLine();

            System.out.printf("you entered %s.%n%n", myString);
        }
    }
}