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
    private final double balance = 0;
    private String pin;

    public static void main(String[] args) {
        int action = promptAction();
    }

    /**
     * Prompt the user for a menu option.
     *
     * @return Returns an `int` that corresponds to the menu option.
     */
    private static int promptAction() {
        int action;
        boolean prompted = false;
        do {
            if (prompted) System.out.println("Please enter a valid number");
            prompted = true;
            System.out.println("\nChoose a number from the following menu:");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Spend money");
            System.out.println("4. Change 4-digit PIN number");
            System.out.println("5. Exit");
            System.out.print(">>> ");
            action = scan.nextInt();
        } while (action < 1 || action > 5);
        return action;
    }
}
