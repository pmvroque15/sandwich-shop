package com.pluralsight;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        //Initialize Scanner
        Scanner scanner = new Scanner(System.in);
        //Create prompts
        //Declare and assign variables for inputs
        double regularSandwichPrice = 5.45;                 //Regular: base price $5.45
        double largeSandwichPrice = 8.95;                   //Large: base price $8.95
        double studentDiscount = 0.10;                       //Student (17 years old or younger) – receive a 10% discount
        double seniorDiscount = 0.20;                        //Seniors (65 years old or older) – receive a 20% discount
        double userTotal = 0;

        //prompts
        System.out.print("What size of sandwich would you like? (1 - Regular or 2 - Large) ");              //Prompt the user for the size of the sandwich (1 or 2):
        int userSizeOfSandwich = scanner.nextInt();
        scanner.nextLine();
        //new prompt: if they would like "loaded" sandwich (y/n)
        //Regular: $1.00
        //Large: $1.75
        System.out.print("Would like your sandwich loaded? (y - yes/n - no) ");
        String userLoadedSandwich = scanner.nextLine();
        System.out.print("How old are you? ");                                                              //Prompt the user for their age
        int userAge = scanner.nextInt();

        //code solution
        //if statement to trigger the two sizes of the sandwiches
        userLoadedSandwich.toLowerCase();                                                                  //making sure input matches with the argument
        if (userSizeOfSandwich == 1) {
            userTotal = regularSandwichPrice;
            //if nested statement for loaded sandwich
            if (userLoadedSandwich.equals("y")) {
                userTotal = userTotal + 1.00;
            }
        } else if (userSizeOfSandwich == 2) {
            userTotal = largeSandwichPrice;
            //if statement for loaded sandwich
            if (userLoadedSandwich.equals("y")) {
                userTotal = userTotal + 1.75;
            }
        } else {
            System.out.print("Invalid sandwich size.");
        }

        //if statement for age and discounts
        if (userAge <= 17) {
            double studentDiscountAmount = userTotal * studentDiscount;
            userTotal = userTotal - studentDiscountAmount;
        } else if (userAge >= 65) {
            double seniorDiscountAmount = userTotal * seniorDiscount;
            userTotal = userTotal - seniorDiscountAmount;
        }

        //Display the cost of the sandwich
        System.out.printf("Your total is: $%.2f", userTotal);
    }
}
