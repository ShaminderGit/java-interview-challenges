import java.util.InputMismatchException;
import java.util.Scanner;

public class ArryInputUtility {


    public static int[] arryUtility() {

        int number = 0;
        boolean flag = false;
        while (!flag) {
            System.out.println("Tell the size of the array");
            try {
                number = InputForScanner.sc.nextInt();
                if (number <= 0 || number == 1) {
                    System.out.println("Please enter the size greater than 1");
                } else {
                    flag = true;
                    break;
                }


            } catch (InputMismatchException e) {
                System.out.println("Wrong Entry , Please enter an integer");
                InputForScanner.sc.next();
            }
        }

        int[] arr = new int[number];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Tell me the element at " + i + " position");
            try {
                arr[i] = InputForScanner.sc.nextInt();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Please enter integer only");
                InputForScanner.sc.next();
            }

        }
        System.out.println("The array is");
        for (int a : arr) {
            System.out.print(a + " ");

        }
        System.out.println();


        return arr;
    }

    ;

}

