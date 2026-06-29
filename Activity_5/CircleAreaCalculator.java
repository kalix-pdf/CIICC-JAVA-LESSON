import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius = readValidNumber(input, "Enter the radius of the circle: ");

        double area = calculateArea(radius);

        System.out.printf("The area of the circle is: %.2f%n", area);
    }
    private static double readValidNumber(Scanner input, String question) {
        while (true) { 
            System.out.print(question);
        
            try {
                double value = input.nextDouble();
                return value;

           } catch (InputMismatchException e) {
                System.out.println("\nEnter a valid input\n");
                input.next();
           }
        }
    }
    private static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
