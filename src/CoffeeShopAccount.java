/*
 * Assignment 05
 * Description: Coffee shop program
 * Name: Kullathon "Mos" Sitthisarnwattanachai
 * Teammate: Amber Hartigan
 * ID: 921425216
 * Class: CSC 210-03
 * Semester: Fall 2020
 */

import java.util.Scanner;

public class CoffeeShopAccount {

    private static final Scanner scan = new Scanner(System.in);
    private static double balance = 0;
    private static String pin;

    public static void main(String[] args) {
        while (true) {
            switch (promptAction()) {
                case 1:
                    displayBalance();
                    break;
                case 2:
                    // addBalance();
                    break;
                case 3:
                    spendBalance();
                    break;
                case 4:
                    // setPin();
                    break;
                case 5:
                    System.out.println("\nExiting... Goodbye!");
                    return;
            }
        }
    }

    /**
     * Prompt the user for a menu option.
     *
     * @return Returns an `int` that corresponds to the menu option.
     */
    private static int promptAction() {
        int action;
        while (true) {
            System.out.println("\nChoose a number from the following menu:");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Spend money");
            System.out.println("4. Change 4-digit PIN number");
            System.out.println("5. Exit");
            System.out.print(">>> ");
            action = scan.nextInt();
            if (action < 1 || action > 5) {
                System.out.println("\nInvalid selection. Please enter a valid option.");
                continue;
            }
            return action;
        }
    }

    /**
     * Prompt the user to enter a PIN. Performs pattern validation to make sure
     * that it is of an expected format (four digit number).
     * <p>
     * Note that it does not check if the pin is correct.
     *
     * @return the given PIN in a valid format.
     */
    private static String promptPin() {
        String input;
        while (true) {
            System.out.println("Enter PIN: ");
            input = scan.nextLine();
            if (!input.matches("^\\d{4}$")) {
                System.out.println("Invalid PIN format. Please enter a four digit PIN.");
                continue;
            }
            return input;
        }
    }

    public static void setPin() {
        System.out.println("Let's set your new PIN number:");
        pin = promptPin();
    }

    /**
     * Display the balance.
     */
    public static void displayBalance() {
        System.out.printf("Your balance is $%.2f%n", balance);
    }

    /**
     * Spend the balance.
     *
     * @param delta The amount to spend.
     */
    public static void spendBalance(double delta) {
        System.out.print("Enter your spending amount: $");
        displayBalance();
        balance -= delta;
        System.out.printf("You are spending: $%.2f%n", delta);
        System.out.printf("Your new balance is: $%.2f%n", balance);
    }
}
