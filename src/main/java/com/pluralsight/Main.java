package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
//        Prompt the user for the size of the sandwich (1 or 2):
//        a. 1: Regular: base price $5.45
//        b. 2: Large: base price $8.95
//        Prompt the user for their age:
//        a. Student (17 years old or younger) – receive a 10% discount
//        b. Seniors (65 years old or older) – receive a 20% discount
//        Display the cost of the sandwich to the screen

        //Initialize Scanner
        Scanner scanner = new Scanner(System.in);
        //Create prompts
        //Declare and assign variables for inputs
        System.out.println("What size of sandwich would you like? (1 - Regular or 2 - Large) ");
        int userSizeOfSandwich = scanner.nextInt();

        System.out.println("How old are you? ");
        int user_age = scanner.nextInt();
        //code solution
        //if statement to trigger the two sizes of the sandwiches
        if (userSizeOfSandwich == 1) {
            System.out.println("Regular sandwich is $5:45");
        } else if (userSizeOfSandwich == 2) {
            System.out.println("Large sandwich costs $8.95");
        } else {
            System.out.print("Sorry try again.");
        }

        //another if statement for age and discounts
        //Display the cost of the sandwich
    }


}
