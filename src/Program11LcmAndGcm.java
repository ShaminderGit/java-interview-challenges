import java.util.InputMismatchException;
import java.util.Scanner;

/*
GCD (Greatest Common Divisor) is the largest number
that divides both numbers without leaving a remainder.
Example
Find GCD of 12 and 18:
- Factors of 12 → 1, 2, 3, 4, 6, 12
- Factors of 18 → 1, 2, 3, 6, 9, 18
- Common factors → 1, 2, 3, 6
- Greatest common factor → 6
GCD(12, 18) = 6
LCM (Least Common Multiple) is the smallest number
that both numbers can divide exactly.
Example
Find LCM of 4 and 6:
- Multiples of 4 → 4, 8, 12, 16, 20…
- Multiples of 6 → 6, 12, 18, 24…
- First common multiple → 12
LCM(4, 6) = 12
*/
public class Program11LcmAndGcm {

    public static void main(String[] args) {
        System.out.println("This program is calculating the LCM of Two Numbers");
        Scanner input = new Scanner(System.in);
        int numberOne = 0;
        int numberTwo = 0;
        boolean flag = false;
        while(!flag){
            try{
                System.out.println("Please enter the first number: ");
                numberOne = input.nextInt();
                System.out.println("Please enter the second number: ");
                numberTwo = input.nextInt();
                if(numberOne==0 || numberTwo == 0){
                    System.out.println("Please enter the numbers greater than zero number");
                }
                else if(numberOne>0  && numberTwo>0){
                    System.out.println("Numbers are :" + numberOne + " " + numberTwo);
                    break;
                }
                else{
                    System.out.println("Number must be positive. Try again.");
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input. Please enter integers only.");
                input.next(); // clear invalid token

            }

        }

        // LCM logic
        int lcm = Math.max(numberOne, numberTwo);

        while (true) {
            if (lcm % numberOne == 0 && lcm % numberTwo == 0) {
                break; // found the LCM
            }
            lcm++;
        }

        System.out.println("The LCM of Two Numbers is: " + lcm);


        //  GCD LOGIC

        int minOfTwoNumbers = Math.min(numberOne, numberTwo);
        int counter = 1;
        int gcd =0 ;


        while (counter <= minOfTwoNumbers) {
            if (numberOne % counter == 0 && numberTwo % counter == 0) {
                gcd = counter;   // update gcd whenever both divide
            }
            counter++;
        }
        System.out.println("The GCD of Two Numbers is: " + gcd);



    }





}
