import java.util.InputMismatchException;
import java.util.Scanner;

public class DescendingPrinterWithMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxNumber = readNumber(input, "Enter max number: ");
        int minNumber = readNumber(input, "Enter min number: ");

        displayResult(maxNumber, minNumber);
    }
    private static int readNumber(Scanner input, String question) {
        while (true) {
            System.out.print(question);
            try {
                int value = input.nextInt();
                if (value > 0) return value;

                System.out.println("Enter a positive number");
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid number");
                input.next();
            }
        }
    }
    private static void displayResult(int maxNumber, int minNumber) {
        for (int count = maxNumber; count >= minNumber; count--) {
            System.out.println(count);
        }
    }
}
