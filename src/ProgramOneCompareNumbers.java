/*
 * Program Statement:
 * Write a program in Java that asks the user how many numbers they want to enter.
 * The program should then take those numbers as input, compare them,
 * and finally display the largest and smallest number.
 */

import java.util.*;

public class ProgramOneCompareNumbers {

    public static void main(String[] args) {
        // Step 1: Ask user how many numbers
        System.out.println("How many numbers do you want to compare?");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        System.out.println("User wants to compare  "+ count + " numbers");
        // Step 2: Create a list to store numbers
        List<Integer> list = new ArrayList<>(count);
        // Step 3: Take inputs
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            list.add(scan.nextInt());
        }
        // Step 4: Print all numbers entered
        System.out.println("\nNumbers entered:");
        for (int num : list) {
            System.out.println(num);
        }
        // Step 5: Find smallest and largest
        Collections.sort(list);
        int smallest = list.get(0);
        int largest = list.get(list.size()-1);
        // Step 6: Display results
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);

        scan.close();



    }

}
