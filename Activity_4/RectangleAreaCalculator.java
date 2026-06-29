import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double length = readValidNumber(input, "Enter the Length: ");
        double width = readValidNumber(input, "Enter the Width: ");

        double area = calculateArea(length, width);
        System.out.println("\nThe area of the rectangle is: " + area);
    }
    private static double readValidNumber(Scanner input, String question) {
        while (true) { 
            System.out.print(question);
            try {
                double value = input.nextDouble();
                return value;

            } catch (InputMismatchException e) {
                System.out.println("\nEnter a valid Number!\n");
                input.next();
            }
        }
    }

    private static double calculateArea(double length, double width) {
        return width * length;
    }
}
