import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEvenChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = readValidNumber(input, "Enter a Number: ");

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd.");
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
}
