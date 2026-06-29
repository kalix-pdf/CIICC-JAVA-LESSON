import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);


        double firstNumber = readValidNumber(numberInput, "Enter  First Number: ");
        double secondNumber = readValidNumber(numberInput, "Enter Second Number: ");

        printResult(firstNumber, secondNumber);
    }
    private static double readValidNumber(Scanner input, String question) {
        while (true) {
            System.out.print(question);
            try {
                double value = input.nextDouble();
                return value;

            } catch (InputMismatchException e) {
                System.out.println("Enter a valid number!");
                input.next();
            }
        }
    }

    private static void printResult(double firstNumber, double secondNumber) {
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;
        double quotient = firstNumber / secondNumber;
        double remainder = firstNumber % secondNumber;

        System.out.println("\nResults:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference:" + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
