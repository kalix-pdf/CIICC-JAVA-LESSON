import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base = readValidNumber(input, "Enter the base: ");
        double height = readValidNumber(input, "Enter the height: ");

        double area = calculateAreaOfTriangle(base, height);

        System.out.printf("The area of the triangle is: %.2f%n", area);
    }
    private static double readValidNumber(Scanner input, String question) {
        while (true) {
            System.out.print(question);
            try {
                return input.nextDouble();

            } catch (InputMismatchException e) {
                System.out.println("\nEnter a Valid Input");
                input.next();
            }
        }
    }
    private static double calculateAreaOfTriangle(double base, double height) {
        return ((double) 1 /2) * base * height;
    }
}
