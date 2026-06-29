import java.util.InputMismatchException;
import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = readValidNumber(input, "Enter first number: ");
        int secondNumber = readValidNumber(input, "Enter second number: ");
        int thirdNumber = readValidNumber(input, "Enter third number: ");

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal!");
        } else {
            System.out.println("The largest number is: " + displayResult(firstNumber, secondNumber, thirdNumber));
        }
    }
    private static int readValidNumber(Scanner input, String question) {
        while (true) {
            System.out.print(question);
            try {
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nEnter a Valid Number!");
                input.next();
            }
        }
    }
    private static int displayResult(int firstNumber, int secondNumber, int thirdNumber){
        int largest = firstNumber;

        if (secondNumber > largest) largest = secondNumber;
        if (thirdNumber > largest) largest = thirdNumber;

        return largest;
    }
}
