import java.util.InputMismatchException;
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int grade = readValidNumber(input, "Enter your Score: ");
        System.out.println("Your grade is: " + displayResult(grade));
    }
    private static int readValidNumber(Scanner input, String question) {
        while (true) {
            System.out.print(question);
            try {
                 return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nEnter a Valid Grade!");
                input.next();
            }
        }
    }
    private static String displayResult(int grade) {
        if (grade >= 90) return "A";
        if (grade >= 80) return "B";
        if (grade >= 70) return "C";
        if (grade >= 60) return "D";
        return "F";
    }
}
