/*Write a program to swap two numbers using assignment operators*/


import java.util.Scanner;

public class ProgramTwoSwap {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);
        // Prompt user to enter the first number
        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();
        // Prompt user to enter the first number
        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();
        // Display numbers before swapping
        System.out.println("Before Swap");
        System.out.println("The first number is: " + number1);
        System.out.println("The second number is: " + number2);
        // Use a temporary variable to swap values
        int  temp;
        temp = number2;
        number2 = number1;
        number1 = temp;
        // Display numbers after swapping
        System.out.println("After Swap");
        System.out.println("The first number is: " + number1);
        System.out.println("The second number is: " + number2);
        // Close the scanner
        input.close();

    }
}
