import java.util.Scanner;

public class ProgramFive {
    /*
      Write a program to calculate the area and parameter
      of the Triangle.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle ie base");
        double base = input.nextDouble();
        System.out.println("Enter the second side of the triangle");
        double side2 = input.nextDouble();
        System.out.println("Enter the third side of the triangle");
        double side3 = input.nextDouble();
        System.out.println("Enter the Height side of the triangle");
        double height = input.nextDouble();
        System.out.println("Let's calculate the parameter");
        double parameter = base + side2 + side3;
        System.out.println("The perimeter is: " + parameter);
        System.out.println("Let's calculate the area");
        double area = 0.5*(base*height);
        System.out.println("The area is: " + area);
        input.close();


    }
}
