/*
   Calculate the compound interest and simple interest
 */

import java.util.Scanner;

public class ProgramSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal: ");
        double principal = input.nextDouble();
        System.out.println("Enter the principal in $ is : "+ principal);
        System.out.println("Enter the interest rate");
        double interestRate = input.nextDouble();
        System.out.println("Enter the interest rate is : " + interestRate);
        System.out.println("Enter the tenure in Year");
        int tenureInYear = input.nextInt();
        System.out.println("Enter the tenure in year is : "+ tenureInYear);
        double simpleInterest = (principal*interestRate*tenureInYear)/100;
        System.out.println("The simple interest is: " + simpleInterest);
        double compoundInterest = principal * (Math.pow((1 + interestRate / 100), tenureInYear) - 1);
        System.out.println("The compound interest is: " + compoundInterest);
        input.close();




    }
}
