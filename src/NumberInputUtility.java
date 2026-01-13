import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberInputUtility {


    public static int readPositiveInt() {

        System.out.println("Which Number You Want To Enter ?");

        while (true) {
            try {
                int number = InputForScanner.sc.nextInt();

                if (number >= 0) {
                    return number;
                } else {
                    System.out.println("Enter a number greater than zero");
                }

            } catch (InputMismatchException e) {
                System.out.println("Wrong input, try again");
                InputForScanner.sc.next(); // clear the entire invalid line

            }
        }
    }
}

