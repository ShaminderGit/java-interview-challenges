/*Develop a program that prints the multiplication
  table for a given number
 */

import java.util.Scanner;

public class ProgramSevenMultiplication {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("The table of : " + number);
        input.close();
        int counter = 1;
        while(counter <= 10){
            System.out.println(number  + "x" + counter + " = " + (number * counter));
            counter++;

        }

    }


}
