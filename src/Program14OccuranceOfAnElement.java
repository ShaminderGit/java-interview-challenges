import java.util.InputMismatchException;
import java.util.Scanner;

public class Program14OccuranceOfAnElement {
    public static void main(String[] args) {

         int[] arr = ArryInputUtility.arryUtility();
         int number = NumberInputUtility.readPositiveInt();
         System.out.println("User wants to get the occurrence of  " + number);
         occurrenceLogic(number,arr);


    }

    public static void occurrenceLogic(int number , int[] arr){
        int counter = 0;
        for (int a : arr){
            if (a == number){
                counter ++;
            }
        }
        System.out.println("The occurrence of " + number + " is " + counter + " times");

    }

}
