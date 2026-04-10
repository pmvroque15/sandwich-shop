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
        double regularSandwichPrice = 5.45;
        double largeSandwichPrice = 8.95;
        double kiddieDiscount = 0.10;
        double oldieDiscount = 0.20;
        double userTotal = 0;
        //prompts
        System.out.print("What size of sandwich would you like? (1 - Regular or 2 - Large) ");
        int userSizeOfSandwich = scanner.nextInt();
        System.out.print("How old are you? ");
        int userAge = scanner.nextInt();
        //code solution
        //if statement to trigger the two sizes of the sandwiches
        if (userSizeOfSandwich == 1) {
            userTotal = regularSandwichPrice;
//            System.out.println("Regular sandwich is $" + String.format("%.2f",userTotal));
        } else if (userSizeOfSandwich == 2) {
            userTotal = largeSandwichPrice;
//            System.out.println("Large sandwich is $" + String.format("%.2f",userTotal));
        }
        //another if statement for age and discounts
        if (userAge <= 17) {
            //print and apply 10% discount on the price
            double kiddieDiscountAmount = userTotal * kiddieDiscount;
            userTotal = userTotal - kiddieDiscountAmount;
            System.out.println("You have a %10 discount!");
        } else if (userAge >= 65) {
            //20% discount
            double oldieDiscountAmount = userTotal * oldieDiscount;
            userTotal = userTotal - oldieDiscountAmount;
            System.out.println("You have a %20 discount!");
        } else {
            //no discount
            System.out.printf("You total is: $%.2f", userTotal);
        }
        //Display the cost of the sandwich
        System.out.printf("Your total now is: $%.2f", userTotal);

    }


}
