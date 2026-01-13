import java.util.InputMismatchException;
import java.util.Scanner;

/*
What is a Prime Number?
A prime number is a number that has exactly two factors:
- 1
- The number itself
That’s it.
No other number should divide it evenly.
Examples of Prime Numbers
- 2 → factors: 1, 2
- 3 → factors: 1, 3
- 5 → factors: 1, 5
- 7 → factors: 1, 7
- 11 → factors: 1, 11
All have only two factors, so they are prime
 */
public class Program12PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean flag = false;
        while (!flag) {
            try {
                System.out.println("Please enter the  number: ");
                number = sc.nextInt();
                if (number == 0 || number == 1 || number == 2) {
                    System.out.println("Please enter a number other than 0 , 1 and 2");

                } else {
                    System.out.println("Number entered  is " + number);
                    flag = true;
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer");
                sc.next();
            }
        }
        sc.close();
        int count = 2;
        boolean isPrime = true;
        while (count <= number / 2) {
            if (number % count == 0) {

                isPrime = false;
                break;
            }
            count++;
        }
        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Not Prime");
        }
}

    }


