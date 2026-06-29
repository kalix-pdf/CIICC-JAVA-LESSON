import java.util.InputMismatchException;
import java.util.Scanner;

public class DescendingPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int validNumber = readNumber(input, "Enter a number: ");

        for (int count = validNumber; count >= 0; count--) {
            System.out.println(count);
        }

        System.out.println("LOOP COMPLETE!");
    }
    private static int readNumber(Scanner input, String question) {
        while (true) {
            System.out.print(question);
            try {
                int number = input.nextInt();
                if (number > 0) {
                    return number;
                }
                System.out.println("\nPlease enter a positive integer!");
            } catch (InputMismatchException e) {
                System.out.println("\nEnter a Valid Number!");
                input.next();
            }
        }
    }
}
