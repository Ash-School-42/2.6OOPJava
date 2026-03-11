/**
* Name: James Ash
* Date: 03-11-2026
* Assignment: 2.6 Performance Assessment - Smallest Number
* Description: This application asks the user how many integers they will enter,
* collects those integers using a loop, and determines the smallest number entered.
**/
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Print assignment title line
        System.out.println("\nJames Ash - Week 2 PA Smallest Number.");

        // Ask user how many integers they will enter
        System.out.print("\nHow many integers will you enter? ");
        int count = input.nextInt();

        int smallest = 0;

        // Loop through user inputs
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter an integer value: ");
            int number = input.nextInt();

            // First loop iteration sets smallest
            if (i == 1) {
                smallest = number;
            } 
            // Compare remaining numbers
            else if (number < smallest) {
                smallest = number;
            }
        }

        // Print the smallest value
        System.out.println("The smallest value entered is: " + smallest);

        input.close();
    }
}