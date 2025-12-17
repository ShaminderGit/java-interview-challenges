/*
Write a program for the product of two floating point numbers
 */

import java.util.Scanner;

public class ProgramFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        float num1 = input.nextFloat();
        System.out.println("Enter the second number "+num1);
        System.out.println("Enter the second number");
        float num2 = input.nextFloat();
        System.out.println("Enter the second number "+num2);
        float product = num1 * num2;
        System.out.println("The product is: " + product);
        input.close();


    }
}
