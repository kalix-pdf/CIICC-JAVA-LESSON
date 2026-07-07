package Activity_18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiveNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = readNumber(input, "Enter a number: ");
        System.out.println("Thank you! You entered " + number);
    }
    private static int readNumber(Scanner input, String question) {
        do {
            try {
                System.out.print(question);
                int value = input.nextInt();
                if (value > 0) return value;

               System.out.println("Please enter a positive number :)");

            } catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                input.next();
            }
        } while (true);
    }
}
