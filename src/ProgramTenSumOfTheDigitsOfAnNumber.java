import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramTenSumOfTheDigitsOfAnNumber {
    public static void main(String[] args) {
        System.out.println("Sum of the digits of an integer");
        Scanner input = new Scanner(System.in);
        int number = 0;
        while (true) {
            try {
                System.out.print("Enter a positive integer: ");
                number = input.nextInt();
                if (number == 0) {
                    System.out.println("The sum of the digits of an integer is 0");
                    return;
                }

                if (number > 0) {
                    System.out.println("Valid number entered: " + number);
                    break; // exit only when correct input is given
                } else {
                    System.out.println("Number must be positive. Try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                input.next(); // clear the invalid input
            }
        }
        input.close();
        int sum = 0;
        while (number > 0) {
            sum= sum + (number % 10); //sum += number % 10;
            number = number/10; // number /= 10;
        }
        System.out.println("The sum of the digits of an integer is: " + sum);


    }}