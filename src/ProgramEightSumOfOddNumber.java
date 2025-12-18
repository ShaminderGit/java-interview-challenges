import java.util.Scanner;

/*
Write a program to get the sum of all odd numbers and even numbers
up to a particular number N
 */
public class ProgramEightSumOfOddNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("The number entered is : " + number);
        input.close();
        int counter = 1;
        int sumOfEven = 0;
        int sumOfOdd = 0;
        while(counter <= number){
            if(counter % 2 == 0){
                System.out.println("The even number is :  " + counter);
                sumOfEven = sumOfEven + counter;
            }
            else{
                System.out.println("The odd number is :  " + counter);
                sumOfOdd = sumOfOdd + counter;
            }
            counter++;
        }
        System.out.println("Sum of even  " + sumOfEven);
        System.out.println("Sum of odd  " + sumOfOdd);


    }
}
