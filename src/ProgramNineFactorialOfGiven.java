import java.util.Scanner;

public class ProgramNineFactorialOfGiven {
    public static void main(String[] args) {
        System.out.println("Factorial of given numbers");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("The number entered is " + number);
        input.close();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        int factorial = 1;
        int temp = number;

        // Build the multiplication steps
        StringBuilder steps = new StringBuilder();
        while (temp > 0) {
            steps.append(temp);
            if (temp > 1) {
                steps.append(" x ");
            }
            factorial *= temp;
            temp--;
        }
        System.out.println("Steps: " + steps);
        System.out.println("The factorial of given numbers is : " + factorial);


    }
}
