import java.util.Scanner;

public class ProgramThreeArithmeticOperators {

    /*
     Write a program that takes two numbers and perform all
     Arithmetic Operators in Java
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        input.close();
        System.out.println("The first number is: " + num1);
        System.out.println("The second number is: " + num2);
        System.out.println("Let's do all operations");
        System.out.println("Let's do Addition Operation");
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        System.out.println("Let's do Subtraction Operation");
        int sub = num1 - num2;
        System.out.println("The subtraction is: " + sub);
        System.out.println("Let's do Multiplication Operation");
        int mul = num1 * num2;
        System.out.println("The multiplication is: " + mul);
        System.out.println("Let's do Division Operation");
        int div = num1 / num2;
        System.out.println("The division is: " + div);
        System.out.println("Let's do Modulus Operation");
        int mod = num1 % num2;
        System.out.println("The modulus is: " + mod);
        input.close();


    }
}
